/* "General Style Settings" */

* {
box-sizing: border-box;
/* Ensures padding and border are included in element's total width and height */
}

body {
    margin: 0;
    padding: 0;
    height: 100vh;
    display: grid;
    grid-template-rows: auto 1fr auto;
    /* Header, content, and footer layout */
    grid-template-areas:
    "header"
    "content"
    "footer";
    font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;
}

/* Navbar Design - Common for all pages */
/* Header Section */
header {
    grid-area: header;
    display: grid;
    align-items: center;
    /* Vertically aligns the header content */
    padding: 0 1rem;
    /* Horizontal padding */
    background-color: #000064;
    color: rgb(250, 250, 250);
    /* White text color */

}

/*Oslomet Logo Styling */
.header-logo {
    height: 6.25rem;
    width: auto;
    /* Maintains aspect ratio */
    margin-left: 1rem;
    /* Spacing from the left */
}

/*Search Box*/
/* Design inspired by https://youtu.be/AmdIfgxMqY8?si=7BBZOvS828VnkFan*/
.search-box {
    display: flex;
    /* Changes the cursor to a pointer (hand icon) to indicate the item is clickable */
    cursor: pointer;
    align-items: center;
    margin-left: auto;
    /* Pushes the search box to the right */
    margin-right: 2rem;
    /* Spacing from the edge */
    justify-self: right;
    padding: 0.3rem 0.9rem;
    border: 0.125rem solid #ddd;
    border-radius: 1.8rem;
    box-shadow: 0 0.6rem 1.5rem rgba(0, 0, 0, 0.3);
}

/*Input space css*/
.search-box:hover input {
width: 100%;

        }

        .search-box input {
width: 0;
outline: none;
/* Removes focus outline */
border: none;
font-weight: 500;
/* Medium font weight */
transition: 0.8s;
background: transparent;
color: #ddd;
}

        /*button and icon*/
        .search-box button {
background: none;
/* "Background is removed" */
border: none;
/* "Frame is removed" */
padding: 0;
/* "Spacing is removed" */
cursor: pointer;
/* "Clickable pointer" */
display: flex;
align-items: center;
justify-content: center;
color: #ffffff;
/* "Icon color" */
font-size: 24px;
/* "Icon size" */
transition: color 0.3s ease;
margin-left: 10px;
}

        .search-box button:hover {
    color: #ffffff;
    /* "Color change on hover effect" */
}


/* Navbar Menu Section*/
.navbar {
    display: grid;
    grid-template-columns: auto 1fr auto;
    /* Logo, menu, and search box layout */
    align-items: center;
    /* Vertically aligns navbar content */
}

/* Menu Styling */
.menu {
    display: flex;
    gap: 1rem;
    /* Spacing between menu items */
    justify-self: end;
    /* Aligns the menu to the right */
}

/* Horizontal Menu Styles for Large Screens */
.menu ul {
display: flex;
margin: 0;
padding: 0;
list-style: none;
/* Removes bullet points */

}

        /* Menu Links Formatting*/
        .menu a {
color: white;
text-decoration: none;
/* Removes underline when not on*/
font-size: 1.3rem;
padding: 0.5rem 0.8rem;
/* Padding around the link */
background-color: #000064;
font-weight: bold;
position: relative;
/* Enables additional styling, like hover effects */
}

/* .menu a:hover {
    text-decoration: underline; /* Adds underline when hovered
}  */
        .menu a.active {
    color: rgb(255, 255, 255);
    /* Set text color to white */
    font-weight: bold;
    /* Make the font bold */
    border-bottom: 2px solid rgb(255, 255, 255);
    /* Add a white bottom border to the active link */
    font-size: 150%;
}


/*-----------Home Page Design------------------*/

/*For Grid structure
Inspired by the following tutorial:
-https://www.youtube.com/watch?v=kI77jbuMU1Y&list=WL&index=11
*/

/* Main Content Layout */
.grid-container-home {
    grid-area: content;
    /* Assigns this grid container to the content area */
    display: grid;
    grid-template-columns: 18% 82%;
    /* Defines the side menu and main content width */
    grid-template-rows: auto auto;
    /* new row for the accordion */
    grid-template-areas:
    "side-menu main-content"
    "accordion accordion";
    /* accordion takes full width at the second row */
    gap: 0.6rem;
    padding: 1.2rem;
    height: auto;
    /* Sets the height based on viewport with a specific offset */
}

/* The home page main-content */
.main-content-home {
    grid-area: main-content;
    grid-column: 2;
    grid-row: 1;
    background-color: #e9e9e9;
    padding: 1.2rem;
    font-size: 1.1rem;
    position: relative;

}

/*Homepage title*/

.page-header {
    justify-content: center;
}

/*HPT1*/
.page-header1 {
    display: flex;
    font-size: 40px;
    color: #222;
    margin-left: 1rem;
}

/*HPT2*/
.page-header2 {
    font-size: 28px;
    color: #222;
    margin-left: 1rem;

}

/*video preview*/
.video {
    width: 100%;
    /* Full width of its container */
    height: 42rem;
    margin-top: -2rem;
}

.video-preview {
    width: 100%;
    display: block;
    margin-bottom: 1rem;
    /* Space below the image */
    text-align: center;
    /* Center the image if needed */
}

.video-preview img {
max-width: 100%;
/* Scale down on smaller screens */
height: auto;
/* Maintain aspect ratio */
border-radius: 8px;
/* Rounds the corners of the image */
/* Additional styling specific to this image */
}

/* Hamburger menu design:
   Inspired by the following tutorials:
   - https://www.youtube.com/watch?v=x3Zu_ncHpas&list=WL&index=6
   - https://www.youtube.com/watch?v=uSHc2YLGBSM&t=1257s
*/

        /* Hamburger Menu and Side Menu (Mobile Screens) */
        /* Hidden checkbox for controlling the hamburger menu */
        .kontrol {
    display: none;
    /* Hidden on larger screens */
}

#kontrol {
    display: none;
    /* Hides the checkbox itself */
}

/* Side Menu on the Home Page */
.side-menu {
    grid-area: side-menu;
    background-color: #f4f4f4;
    /* Light gray background for the menu */
    display: flex;
    flex-direction: column;
    /* Align items vertically */
    align-items: flex-start;
    /* Aligns items to the start of the container */
    padding: 0.625rem;
    /* Padding equivalent to 10px */
}

/*
Information panel design:
Inspired by the following resources:
- https://www.quora.com/How-do-I-make-a-div-visible-on-clicking-a-link-using-only-HTML-and-CSS
- https://css-tricks.com/css-grid-can-do-auto-height-transitions/
- https://css-tricks.com/hide-scrollbars-during-an-animation/
- https://www.youtube.com/watch?v=9XiEm6RpCFU&list=WL&index=17
*/

/* Side menu links */
.side-link {
    width: 100%;
    /* Full width of the menu */
    padding: 0.6rem;
    margin-bottom: 0.3rem;
    background-color: #007acd;
    color: white;
    border: none;
    cursor: pointer;
    /* Adds pointer cursor for interactivity */
    text-align: left;
    font-size: 1.2rem;
    /* Larger font size for readability */
    border-radius: 0.3rem;
}

/* Hover effect to improve link visibility */
.side-link:hover {
    background-color: #00093c;
}

/* Toggle for opening/closing panels */
.panel-toggle {
    display: none;
    /* Initially hidden until triggered */
}

/* Info Panel (content displayed when side-link is clicked) */
.info-panel {
    display: none;
    /* Hidden by default */
    background-color: #f8f8f8;
    padding: 1rem;
    border: 1px solid #ddd;
    /* Light gray border for separation */
    margin-top: 1rem;
    border-radius: 0.3rem;
    position: absolute;
    /* Positioned relative to the parent */
    top: 0;
    /* Aligns panel to the top */
    left: 0;
    /* Aligns panel to the left */
    width: 100%;
    /* Full width of the content */
    max-width: 100%;
    /* Ensures panel doesn’t exceed container width */
    text-align: left;
    /* Aligns text to the left */
    visibility: hidden;
    /* Initially invisible */
    overflow: hidden;
    /* Hides content outside the container */
    word-wrap: break-word;
    /* Breaks long text into multiple lines */
    transition: max-height 0.5s ease-out;
    /* Smooth transition when opening/closing */
}

/* Displays the info panel when the corresponding radio button is checked */
.panel-toggle:checked+.info-panel {
    display: block;
    visibility: visible;
    /* Makes the panel visible */
    max-height: none;
    /* Removes height restriction when opened */
}

input[type="radio"]:checked+label+.info-panel {
    display: block;
    /* Displays the panel */
}

/* Close button for the info panel */
.close-btn {
    position: absolute;
    top: 0.625rem;
    right: 0.625rem;
    background: none;
    border: none;
    color: #666;
    font-size: 1.2rem;
    cursor: pointer;
}

/* Link styling */
.samordlink {
    color: blue;
    /* Blue to indicate a clickable link */
}

.samordlink:visited {
    color: purple;
    /* Changes color after the link is visited */
    text-decoration-color: rgb(78, 13, 110);
    /* Changes underline color to purple */
}

/* Button design for ACIT page redirection */
.acit-btn {
    background-color: #2e3b86;
    color: white;
    padding: 0.3rem 0.8rem;
    text-decoration: none;
    border-radius: 5%;
    display: inline-block;
}

/*to make the underline appear when hovering over the button*/
.acit-btn:hover {
    color: #e9e3e4;
    text-decoration: underline;
}

/* Styling for each information block */
.shortinfo {
    /*padding: 0.2rem 0;  Adds spacing top and bottom */
    border-bottom: 1px solid #00093c;
    /* Adds a bottom border with a dark blue color */
}

/* Remove the bottom border for the last information block */
.shortinfo:last-child {
    border-bottom: none;
}


/* Style for informational text */
.shortinfo p {
margin: 0.1rem 0 0;
/* Adds a small top margin below the title */
color: #555;
        }


        /* Table Styles for Study Programs */

        /* Display the appropriate table when a specific radio button is selected */
        #matematik-fysikk:checked~.studie-table-container #matematik-fysikk-prog,
        #statistik-data:checked~.studie-table-container #statistik-data-prog,
        #vitenskapelige-beregninger:checked~.studie-table-container #vitenskapelige-beregninger-prog {
    display: block;
    /* Shows the corresponding study program table */
}

.label-matematik,
        .label-statistik,
        .label-vitenskapelige {
    padding: 0.5rem 0.9rem;
    color: white;
    margin-right: 0.3rem;
    border-radius: 0.3rem;
    cursor: pointer;
    font-weight: bold;
    background-color: #2b6fb7;
}

.label-matematik:hover,
        .label-statistik:hover,
        .label-vitenskapelige:hover {
    background-color: #01336a;
}

table {
    width: 100%;
    border-collapse: collapse;
    /* Collapses table borders */
}

th,
td {
    padding: 0.4rem 0.6rem;
    text-align: left;
    border-bottom: 1px solid #2d3223;
    /* Dark border below each row */
}

th {
    margin: 0.5rem;
    background-color: rgb(4, 37, 88);
    color: white;
    text-align: center;
    font-weight: bold;
    /* Makes header text bold */
}

/* Study program tables are initially hidden */
.table {
    display: none;
}


/*"The section below the video"*/

/* "General styles" */
.accordion {
    grid-area: accordion;
    grid-column: 1 / 3;
    grid-row: 2;
    width: 100%;
    max-width: 50%;
    margin: 10px auto;
    border: 1px solid #ddd;
    border-radius: 5px;
    overflow: hidden;
    color: white;
    font-family: Arial, sans-serif;
}

/* Title style */
.accordion label {
display: block;
padding: 15px;
background-color: #007acd;
cursor: pointer;
font-size: 19.2px;
border-bottom: 1px solid #ddd;
font-weight: 400;
        }

        .accordion label:hover {
    background-color: #00093c;
}

/* "Content control with a hidden checkbox" */
.accordion input[type="checkbox"] {
display: none;
}

        /* "Panel content style" */
        .content {
    max-height: 0;
    overflow: hidden;
    transition: max-height 0.4s ease;
    background-color: rgb(255, 255, 255);
    padding: 0 15px;
    color: black;
}

/* "Displaying content when open" */
.accordion input[type="checkbox"]:checked~.content {
    max-height: 1000px;
    /* "You can adjust the value based on the content" */
    padding: 15px;
}

/* "1st panel design" */
.spør-link-design1 {
    font-size: 18px;
    font-family: Arial, sans-serif;
    font-weight: 400;
}

.spør-link-design2 {
    color: black;
    font-size: 28px;
    font-family: Arial, sans-serif;
    font-weight: 800;

}

.spør-link-design3 {
    font-size: 18px;
    font-family: Arial, sans-serif;
    font-weight: 400;
}

.spør-link-design4 {
    font-size: 18px;
    font-family: Arial, sans-serif;
    font-weight: 400;
}

/* "2nd panel link design"*/
.link-design1 {
    border-bottom-style: solid;
    border-bottom-color: #222;
    font-family: Arial, sans-serif;
}

.link-design3 {
    font-weight: 700;
}

.link-design4 {
    color: #222;

    /* "3rd panel design" */

}

.images-613 {
width: 650px;
}

        .bilde-design {
    display: flex;
    /* "Flexbox is enabled" */
    justify-content: center;
    /* "Horizontal alignment" */

}

.st-his-link-design1 {
    font-weight: 600;
    font-size: 16px;
}


.st-his-link-design2-1 {
font-size: 28px;
margin-top: 50px;
font-weight: 700;
        }

        .st-his-link-design2-2 {
font-size: 18px;
margin-top: -10px;
color: #222;
font-weight: 400;
        }

        .st-his-link-design3 {
    font-size: 28px;
    margin-top: 40px;
    font-weight: 700;
    display: flex;
    /* "Flexbox is activated" */
    justify-content: center;
    /* "Horizontal centering" */
}




/*Footer*/
footer {
    width: 100%;
    position: relative;
    bottom: 0;
    background: linear-gradient(to right, #00093c, #2d0b00);
    color: white;
    padding: 10px 0;
    font-size: 13px;
    line-height: 20px;
}

.row {
    width: 85%;
    margin: auto;
    display: flex;
    flex-wrap: wrap;
    align-items: flex-start;
    justify-content: space-between;
    gap: 1rem;
    /*decrerases the distance between the rows*/

}

.column {
    display: flex;
    flex-direction: column;
    align-items: center;
    padding: 2px;
    flex: 1;
    max-width: 300px;
}

.column p {
font-size: 1.2rem;
/* "Increase the font size" */
line-height: 1.4;
        /* "Adjust the line spacing" */
        }

        .column p a {
    font-size: 1.3rem;
    ;
}

.column h3 {
color: white;
font-size: x-large;
margin-top: 5px;
font-weight: bold;
white-space: nowrap;
padding: 2rem;
margin-bottom: 0;

        }

        .contact-link {
    display: block;
    /* "Move the link to a new line" */
    font-weight: bold;
    font-size: 1rem;
    text-decoration: none;
    color: white;
    margin-top: 60px;
    /* "Adds some spacing from the top" */
    text-decoration: underline;
}

.contact-link:hover {
    text-decoration: underline;
}

ul li {
list-style: none;
margin-bottom: 12px;
}

ul li a {
    text-decoration: underline;
    color: white;

}


.column i {
display: block;
margin-bottom: 10px;
text-align: left;
font-size: 2rem;
/*to make the social media icons bigger*/
}

        .column a {
color: white;
font-size: 1rem;
margin-bottom: 10px;
display: block;
transition: transform 0.3s ease;
padding: 5px 10px;
}

        .column a:hover,
        .column a:focus {
    transform: scale(1.1);
    /*"If it is desired to appear in a box shape, `outline: 2px solid white;` can be added."*/
    outline-offset: 4px;
}

/* "2x2 grid settings for social media icons" */
.social-media-grid {
    padding: 4rem;
    display: grid;
    gap: 10px;
    text-align: center;
    width: 100%;

}

.social-media-grid a {
color: white;
font-size: 1.2rem;
transition: transform 0.3s ease;
text-decoration: underline;
/*underlines the names of the links*/
display: flex;
align-items: center;
justify-content: center;
padding: 5px;
}

        .social-media-grid a:hover {
    transform: scale(1.1);
}

.social-media-grid i {
margin-right: 8px;
font-size: 1.8rem;
/* "Icon size" */
}

        /* "Footer codes end here. To be edited."*/


        /*-----------Activity Page Design------------------*/
        /*general stle of the main */
        .main {
    max-width: 1800px;
    /* Limit the content width. */
    margin: 0 auto;
    /* centers the elements*/
}

/*styling codes for rhe background container*/
.background-container {
    max-width: 1200%;
    /*  streches the width of the backgound container completely*/
    gap: 2rem;
    padding: 20px;
    /*"Add padding between the content and the edges." */
    background-color: #b3e5fc;
    /*makes background light blue color*/
    border-radius: 10px;
    /* round the corners*/
    box-sizing: border-box;
    /* used to prevent overflow*/
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
    /* added a bit shadow */
    margin: 2.5rem;

}

/*the head title*/
.introduksjontittel {
    padding-top: 1rem;
    text-align: center;
    /*keeps the text in the middle of the place*/
    font-size: 2.5rem;
    /*it fits better to the page with this font size*/

}

/*styling codes of the first section part. inroduction part*/
.aktivitetsoversikt {
    text-align: center;
    /*keeps the title in the  center*/
    width: 100%;
    line-height: 1.8;
    /* used to increase the line spacing */

}

/*styling of the subtitle. used to center it*/
.aktivitetsoversikt h2 {
text-align: center;
/*keeps the subtitle in the center of the page*/
margin-top: 1rem;
margin-bottom: 1rem;
}

        /*image container styling */
        .image-container {
    display: grid;
    /* used to make elements 2 column grid container */
    grid-template-columns: 1fr 1fr;
    /*kepp the images in the same grid container*/
    object-fit: contain;
    /*used to fit the images entirely in the container*/
    gap: 20px;
    /* leaves space between images*/
    justify-content: center;
    /* keeps the images (grid container) in the center */
}

.image-figure-intro img {
width: 100%;
        /* the width of the images */
        }

        .image-figure-intro figcaption {
font-size: 1.2rem;
/* resized to make it more readable */
color: #555;
/* color of the figcaption text */
text-align: center;
/*is alligned in the center under the images*/
}

        .aktivitetsoversikt article {
text-align: justify;
/*used to align the text to both the left and the right margins*/
font-size: 1.5rem;
/*used this size to make it easier to read for the users*/
margin: 0 auto;
/*used to leave equal margins on the sides*/
max-width: 90%;
/*used to keep the content a bit smaller in the page and it fits better with this way*/
padding-bottom: 2rem;
/*make space between the text and the white grid*/
}

        /*styling codes of the white grids*/
        .grid-container-activity {
    display: grid;
    /* used to make elements (text and the image) 2 column grid container */
    gap: 3rem;
    /* used to leave space between the grids */
    margin: 0 auto;
    /*centers the grids in the page*/
    max-width: 90%;
    /*adjusted the size of grids to 90% to make a good look and design. So,it will be placed inside the blue background nicely*/
}

/*styling of items inside the white grids*/
.grid-item-activity {
    display: grid;
    grid-template-columns: 1fr 1fr;
    /* created to coloumn grids*/
    justify-content: center;
    align-items: center;
    gap: 4.5rem;
    background-color: #ffffff;
    border: 1px solid #292727;
    border-radius: 8px;
    padding: 1rem;
    box-shadow: 10px 10px 20px rgba(0, 0, 0, 0.3);
    transition: transform 0.2s ease-in-out, box-shadow 0.2s ease-in-out;
}

.grid-item-activity article {
margin-top: 3rem;
margin-left: 2rem;
text-align: left;
/*keeps te text on the left side*/
margin: 1rem;
font-size: clamp(1rem, 1.5vw, 1.2rem);
/* used to adjust the size of font */

}

        .grid-item-activity p {
display: grid;
line-height: 1.8rem;
font-size: clamp(1rem, 1.5vw, 1.2rem);
/* used for adjusting the size of font */
}

        .grid-item-activity img {
width: 100%;
text-align: center;
/*aligns the items in the center*/
box-shadow: 3px 5px 5px rgba(0, 0, 0, 0.3);
border-radius: 4px;

}

        /* sub-headings */
        .grid-item-activity h3 {
color: #0805f0;
line-height: 3rem;
font-size: clamp(1.5rem, 1.5vw, 1.2rem);
/* "Text size is limited" */
}

        .grid-item-activity figure {
margin-right: 0;
flex: 0 0 auto;
justify-content: flex-end;
}


        /*css codes of the figcaption*/
        .grid-item-activity figcaption {
color: #4b4848;
padding: 0.5rem;
margin-bottom: 2rem;
font-style: italic;
text-align: center;
/*"Centers the caption below the image"*/

}

        /* css coding of the links */
        /* it will be seen with these codes on the page*/
        .activity-knapp,
        .activity-link {
    color: #007acd;
    /* links will be this color */
    text-decoration: underline;
    /* text is underlined*/
    font-weight: bold;
    /*make it bold for more visibility*/

}

/* Hover css of the links */
.activity-knapp:hover,
        .activity-link:hover {
    color: #0056b3;
    /* "Darkens on hover" */
    text-decoration: underline;
    /* text is underlined for more visibility */
}

/* css for The links after thet clicked*/
.activity-knapp:visited,
        .activity-link:visited {
    color: #840db3;
    /* when it is clicked, the color turns to purple*/

}


@media (max-width: 768px) {
    .image-container {
        grid-template-columns: 1fr;

    }

    .image-figure-intro img {
        width: 100%;
        /* "The image fits the box at full width" */
        height: auto;
        /* "The height is adjusted while maintaining its aspect ratio" */
        object-fit: contain;
        /* "Fits the entire image into the box" */
        display: block;
        /* "Removes the padding around the image" */
        margin: 0 auto;
        /* "Centers" */
    }

    .image-figure-intro figcaption {
        align-items: start;
        width: 100%;
        word-wrap: break-word;
    }

    .grid-container-activity {
        grid-template-columns: 1fr;
        /* "Single-column layout" */
        gap: 2rem;
        /* "Spacing between boxes" */

    }

    .grid-item-activity {
        display: grid;
        grid-template-columns: 1fr;
        align-items: center;
        /* "Centers the content" */
        text-align: start;
        /* "Centers the text" */


    }

    .grid-item-activity figure {
        display: flex;
        flex-direction: column;
        /*"Stack the image and the description on top of each other" */
        align-items: center;
        /* "Center the image and the description horizontally" */
        justify-content: center;
        /* "Center the image and the description vertically" */
        width: 100%;
        margin: 0 auto;
    }

    .grid-item-activity img {
        width: 100%;
        /* "Fit the image into the box" */
        height: auto;
        /* "Maintain the aspect ratio" */
        object-fit: contain;
        /* "Display the entire image" */
    }

    .grid-item-activity figcaption {
        margin-top: 0.5rem;
        /* "Add spacing between the image and the caption" */
        font-size: 1rem;
        /* "Reduce the caption font size on small screens" */
        color: #555;
        /* "Set the caption color" */
    }

    .accesibility-testing {
        grid-template-columns: 1fr;
        /* "Switch to a single column" */
        gap: 1rem;
        /* "Reduce the spacing between the boxes" */
        margin: 1rem;
        /* "Reduce the outer margin" */
    }



}

/* "Switch to a single column on large scales and small screens" */
@media (max-width: 1024px),
        (min-resolution: 192dpi) {


        .grid-container-activity {
    grid-template-columns: 1fr;
    /* "Single-column layout on large screens" */
    gap: 2rem;
    /* "Spacing between boxes" */
}

    .grid-item-activity {
    display: flex;
    flex-direction: column;
    align-items: center;
    /* "Center" */
    text-align: start;
    /* "Center the text" */
}

    .grid-item-activity img {
width: 100%;
/* "Full image width" */
height: auto;
/* "Height proportional" */
margin-bottom: 1rem;
/* "Add spacing below the image" */
    }
            }

            /*Activity page design css is finished here*/




            /*ACCESIBILITY STATUS REPORT OF THE WEBSITE PAGE CSS*/
            .accesibility-page {
    background-color: #ffffff;

    margin: 0 auto;
    /*"To align in the center"*/
    padding: 0 5%;
    /* "Leaves a 5% margin on the left and right sides of the screen" */
    font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;
}

.accesibility-page h1 {
text-align: center;
/*keeps the title in the center of the page*/
margin-top: 4rem;
/*to make a space betwen hesader and he title*/
font-size: clamp(2.5rem, 2.5vw, 3rem);
/* Dinamik yazı boyutu */
}

        .accesibility-page p {
padding-left: 2rem;
/*gives space between the website frame and the text*/
padding-right: 2rem;
/*gives space between the website frame and the text*/
padding-bottom: 0.1rem;
/*used to make the space between paragraphs smaller*/
line-height: 3rem;
/*used to leave spaces between the lines, to make it easier to read.*/
margin-bottom: 0.5rem;
}

        .accesibility-page-images {
    display: grid;
    /* "Use flexbox to arrange side by side" */
    grid-template-columns: 1fr 1fr;

    gap: 20px;
    /* "Spacing between images" */
    justify-content: center;
    /* "Centers the images" */
    align-items: start;
    /* "Aligns the top of the images" */
}

.accesibility-page-images figure {
display: grid;
align-items: center;
/* Center-align the content */
text-align: center;
/* Center text within the figure */

}

        .accesibility-page-images img {

width: 100%;
/* "Expands according to the container" */
height: auto;
max-width: 100%;
/* "The image does not overflow the container" */
aspect-ratio: 16/9;
/* "Maintains the aspect ratio" */
object-fit: contain;
/* "To display the entire image" */
border-radius: 8px;
border: solid #000064;

        }



        .accesibility-page-images figcaption {
font-size: 1rem;
/* Alt açıklama yazı boyutu */
color: #555;
/* Yazı rengi */
margin-top: 0;
padding-top: 1rem
}

        .accesibility-testing {
    box-shadow: 0 3px 5px rgba(0, 0, 0, 0.2);
    /* Subtle shadow for depth and emphasis */
    min-height: 400px;
    margin: 2rem;
    display: grid;
    grid-template-columns: repeat(2, 1fr);
    /* Three columns of equal width */
    gap: 30px;
    /*  styles of the subtitles in the accesibility-testing section */
}

.accesibility-testing h2 {
margin-bottom: 2rem;

}


        /* styleling the articles inside the section */

        .accesibility-testing article {
background-color: #a1d6fa;
padding: 2rem;
border-radius: 5px;

}





        /* its starting  ---- GITHUB css-codes  ---- */
/* Benefited with this nettside:
https://www.w3schools.com/css/css3_images.asp
*/

        .GitHubPageMain {
    padding: 2rem;/* Adds space inside the main container */
    font-family: Arial;/* Sets the font style to Arial */
    line-height: 1.6;/* Adjusts line spacing for better readability */
    color: #334;/* Sets text color */
    text-align: center;/* Centers all content inside this container */
}

.GitHubPageImages {
    display: grid;/* Creates a grid layout for images */
    grid-template-columns: repeat(2, 1fr);/* Sets two equal-width columns */
    gap: 1rem;/* Adds spacing between grid items */
    padding: 0;/* Removes padding inside the grid container */
}

.GitHubPageimage {
    width: 100%;/* Makes images fully responsive */
    height: auto;/* Keeps the original aspect ratio of images */
    border-radius: 1rem;/* Rounds the corners of images */
}

.GitHubPageimage:hover {
    transform: scale(1.09);/* Zooms in on the image slightly when hovered */
}

.GitHubPageFigure {
    margin: 0;/* Removes default margin around figure */
    padding: 0;/* Removes default padding around figure */
    text-align: center;/* Centers content inside the figure */
}

.GitHubPageFigcaption {
    font-size: 0.85rem;/* Sets a smaller font size for captions */
    color: #555;/* Sets a light gray color for captions */
    margin-top: 0.75rem;/* Adds spacing above the caption */
}

.GitHubPageTextContent {
    max-width: 800px;/* Limits the width of the text content area */
    margin: 2rem auto;/* Centers the text block with top and bottom spacing */
    padding: 1.5rem;/* Adds padding inside the text content container */
    border: 0.05rem solid #ddd;/* Adds a light border around the content */
    border-radius: 0.5rem;/* Rounds the corners of the text content box */
}

.GitHubPageTextContent h3 {
color: #0056b3;/* Sets a blue color for section headers */
font-size: 1.5rem;/* Adjusts header font size */
}

        .GitHubPageTextContent h3:not(:first-of-type) {
    border-top: 0.04rem solid #dde;/* Adds a top border for all headers except the first */
    padding-top: 1rem;/* Adds space above the header */
    margin-top: 1.6rem;/* Adds additional space above the header */
}

.GitHubPageTextContent p {
margin-bottom: 1rem;/* Adds space below each paragraph */
font-size: 1rem;/* Sets a standard font size for paragraphs */
text-align: left;/* Aligns paragraph text to the left */
line-height: 1.7;/* Increases line spacing for readability */
text-indent: 2.3rem;/* Indents the first line of each paragraph */
}



/* Ekran küçüldüğünde düzenleme */
@media (max-width: 768px) {
    .accesibility-page-images {
        grid-template-columns: 1fr;
        /* Tek sütuna geçiş */
    }

    .accesibility-page-images img {
        width: 100%;
        /* Küçük ekranlarda görsel genişliği cihaz genişliğiyle uyumlu olur */
        height: auto;
    }



    .accesibility-page-images figcaption {
        font-size: 1.2rem;
        /* Alt açıklamanın boyutunu küçült */
    }

    .accesibility-testing {
        display: grid;
        grid-template-columns: 1fr;
        gap: 20px;
        /* Adds space between the boxes */
        margin: 20px auto;
        /* Centers the grid and adds space on top and bottom */
        max-width: 90%;
        /* Limits the overall width of the grid */

    }

    .accesibility-testing article {
        border-radius: 8px;
        /* Rounds the corners */
        padding: 20px;
        /* Adds padding inside each box */
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        /* Adds a soft shadow for better visual separation */
        text-align: left;
        /* Aligns text to the left */
    }

    .accesibility-testing h2 {
        font-size: 1.8rem;
        /* Sets the font size for the headings */
        margin-bottom: 10px;
        /* Adds space below the heading */
        color: #333;
        /* Makes the heading text dark for contrast */
    }
}

/*Accesibiity ikinci kisim stilleri burada bitiyor*/

/*Telefon boyutuna gelince olacak degisiklikler*/
/* Mobilde Sağdan Açılan Yan Menü */
@media (max-width: 768px) {

    .search-box {
        justify-self: left;
        margin-left: 0;
        margin-right: 0;
    }

    /* Hamburger menü simgesi */
    .kontrol {
        display: block;
        font-size: 2rem;
        color: white;
        position: fixed;
        top: 1rem;
        right: 1rem;
        cursor: pointer;
        z-index: 20;
        transition: transform 0.3s ease;
    }

    /* Yan menü gizli başlar */
    .menu {
        position: fixed;
        right: -100%;
        top: 0;
        height: 40%;
        width: 150px;
        background-color: #000064;
        transition: right 0.5s ease;
        z-index: 15;
        padding-top: 60px;
    }

    .menu ul {
        display: flex;
        flex-direction: column;
        padding: 0;
        margin: 0;
    }

    .menu ul li {
        text-align: left;
        padding: 0.8rem;
    }

    .menu a {
        background-color: #000064;
        font-size: 1rem;
    }

    /* Menü açılınca sağdan göster */
    #kontrol:checked~.menu {
        right: 0;
    }

    /* Başlangıçta sadece üç çizgi (fa-bars) görünür */
    .kontrol .fa-bars {
        display: inline-block;
    }

    .kontrol .fa-times {
        display: none;
        /* X başlangıçta gizli */
    }

    /* Hamburger menü açıldığında ikon değişir */
    #kontrol:checked+.kontrol .fa-bars {
        display: none;
        /* Üç çizgi gizlenir */
    }

    #kontrol:checked+.kontrol .fa-times {
        display: inline-block;
        /* X görünür hale gelir */
    }

    /* Grid düzenlemesi mobilde */
    .grid-container-home {
        grid-template-columns: 1fr;
        grid-template-rows: auto auto auto;
        grid-template-areas:
        "side-menu"
        "main-content"
        "accordion";
    }

    .side-menu {
        grid-area: side-menu;
        display: flex;
        flex-direction: column;
        /* Menü elemanlarını yatay hizalamak için */
        justify-content: flex-start;
        /* Elemanları ortalayarak hizalamak için */
        gap: 0.1rem;
        /* Menü elemanları arasındaki boşluk */
        background-color: #ddd;
        /* Görsel ayrım için arka plan rengi */
        z-index: 5;
        padding: 0.1rem;
        /* Yatay menü için daha dar padding */
    }


    .main-content-home {
        position: relative;
        /* Info-panel için referans sağlar */
        z-index: 1;
        /* Panelin altında kalır */
    }


    /* Mobil görünümde info-paneller */
    .info-panel {
        position: absolute;
        /* Parent öğeye göre konumlanır */
        top: 0;
        /* Side-link'e göre üstten hizalanır */
        left: 0;
        /* Side-link'e göre soldan hizalanır */
        z-index: 10;
        /* Üstte görünmesi için yüksek bir değer atanır */
        width: 100%;
        /* Mobilde tam genişlik */
        max-width: none;
        /* Genişlik sınırı kaldırılır */
        visibility: hidden;
        /* Varsayılan olarak gizli */
        max-height: 0;
        /* Yüksekliği kapalıyken sıfır */
        transition: all 0.5s ease-out;
        /* Yumuşak geçiş */
        margin: 0;
        /* Paneller arasında boşluk kaldırılır */
        overflow: hidden;
        /* İçeriğin taşması önlenir */
        background-color: #f8f8f8;
        /* Panelin arka planı */
        padding: 1rem;
        /* Panel içeriği için padding */
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
        /* Gölgelendirme ile belirginlik */
    }

    /* Panel görünümü tetiklendiğinde */
    .panel-toggle:checked+.info-panel {
        visibility: visible;
        max-height: 300px;
        /* Açıkken maksimum yükseklik */
        overflow: auto;
        /* Uzun içerik kaydırılabilir olur */
    }

    /* Mobil side-link düzeni */
    .side-link {
        position: relative;
        /* Info-panel'in konumlanması için referans */
        font-size: 1rem;
        z-index: 5;
        /* Side-link'in panelden daha geride kalması sağlanır */
        padding: 0.2rem;
        margin-bottom: 0.15rem;
    }


    /* Kapatma düğmesi düzeni */
    .close-btn {
        position: absolute;
        top: 0.5rem;
        right: 0.5rem;
        font-size: 1.2rem;
        color: #000;
        background: none;
        border: none;
        cursor: pointer;
    }

    .label-matematik,
    .label-statistik,
    .label-vitenskapelige {
        padding: 0.2rem 0.2rem;
        color: white;
        margin-right: 0.1rem;
        border-radius: 0.1rem;
        cursor: pointer;
        font-weight: bold;
        background-color: #2b6fb7;
        font-size: 0.7rem;
    }

    /*activiy page deki grid item activity yi tek sutuna*/
    .grid-container-activity {
        grid-template-columns: 1fr;
        /* Tek sütuna geçiş */
        gap: 2rem;
        /* Kutular arasındaki boşluk */
    }

    .grid-item-activity {
        display: flex;
        flex-direction: column;
        /* İçeriği dikey hizaya geçirin */
        align-items: center;
        /* İçeriği ortalayın */
        text-align: center;
        /* Metni ortalayın */
    }

    .grid-item-activity figure {
        width: 100%;
        /* Resim kapsayıcı genişliği */
        margin-bottom: 1rem;
        /* Metinle resim arasındaki boşluk */
    }

    .grid-item-activity img {
        width: 90%;
        /* Resmi daha küçük yaparak ortalayın */
        height: auto;
        /* Oranı koruyarak yeniden boyutlandır */
    }

    .grid-item-activity article {
        width: 100%;
        /* Makale genişliğini ayarla */
    }


}

@media (max-width: 1024px) {}




@media(min-width:320px) and (max-width:480px) {}

@media (min-width: 1920px) {}






/* finish activitet side*/


/*css settings for ...... */
@media (max-width: 768px) {
    /*HOMEPAGE-CSS*/

    /*Activity*/

    /*GitHub*/
    .GitHubPageTextContent {
        text-align: center;/* Centers all text content in this container */
        padding: 1rem;/* Adds padding inside the text content area */
    }

    .GitHubPageTextContent h3 {
        font-size: 1.3rem;/* Sets a smaller font size for section headers */
    }

    .GitHubPageTextContent p {
        font-size: 0.9rem;/* Reduces font size for paragraph text */
    }

    .GitHubPageImages {
        grid-template-columns: 1fr;/* Displays all images in a single column */
    }

    /*Accessibility*/



}

/*CSS settings for MOBILE*/
@media (max-width: 480px) {

    /*HOMEPAGE-CSS*/
    .page-header {
        justify-content: center;/* Centers the content horizontally */
    }

    .page-header1 {
        display: flex;/* Enables a flexible layout for the header */
        font-size: 1.8rem;/* Sets the font size for the main header */
        color: #222;/* Applies a dark gray color to the text */
        margin-left: 1rem;/* Adds spacing to the left of the header */
    }

    .page-header2 {
        font-size: 1.5rem;/* Sets a slightly smaller font size for the subheader */
        color: #222;/* Applies a dark gray color to the subheader text */
        margin-left: 1rem;/* Adds left spacing to the subheader */
    }

    .video {
        width: 100%;/* Makes the video take up the full width of its container */
        height: 42rem;/* Sets a fixed height for the video */
        margin-top: -2rem;/* Moves the video slightly upwards */
    }




    /*Activity*/

    /*GitHub*/

    .GitHubPageMain {
        padding: 1rem;/* Adds padding around the main container for spacing */
    }

    .GitHubPageImages {
        gap: 1rem;/* Sets spacing between images in the grid layout */
    }


    /*Accessibility*/


}