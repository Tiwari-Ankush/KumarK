***CSS***

1. **What is CSS?**
   - CSS (Cascading Style Sheets) is a style sheet language used for describing the presentation of a document written in HTML.
   - It defines how elements should be displayed on a webpage.

2. **Basic syntax of CSS?**
   - CSS rules consist of a selector and a declaration block.
   - Example: `selector { property: value; }`

3. **How to add CSS in HTML? State different ways of adding CSS in HTML?**
   - Inline: `<p style="color: blue;">This is a blue paragraph.</p>`
   - Internal: `<style> p { color: red; } </style>`
   - External: `<link rel="stylesheet" href="styles.css">`

4. **What are CSS selectors?**
   - CSS selectors target HTML elements for styling.
   - Examples include element selectors (`p`), class selectors (`.class`), and ID selectors (`#id`).

5. **How class, ID, element selectors work?**
   - Class selectors: `.classname` targets elements with a specific class.
   - ID selectors: `#idname` targets a unique element by its ID.
   - Element selectors: `element` targets all instances of a specific HTML element.

6. **What are color codes in CSS (e.g., #, rgb, hsl)?**
   - #RRGGBB (Hexadecimal)
   - rgb(255, 0, 0) (RGB)
   - hsl(0, 100%, 50%) (HSL)

7. **What is the background property in CSS?**
   - The `background` property sets various background properties like color, image, and positioning.
   - Example: `background: #f0f0f0 url('background.jpg') no-repeat center;`

8. **What is the border property and its attributes in CSS?**
   - The `border` property sets the width, style, and color of an element's border.
   - Example: `border: 2px solid #333;`

9. **What is height and width in CSS?**
   - `height` sets the height of an element.
   - `width` sets the width of an element.

10. **What is padding and margin in CSS?**
    - `padding` is the space inside the element's border.
    - `margin` is the space outside the element's border.

11. **Box model of CSS?**
    - The box model includes content, padding, border, and margin.
    - It defines how these components interact within an element.

12. **What are text properties in CSS?**
    - Text properties include font size, color, and alignment.
    - Example: `font-size: 16px; color: #333; text-align: center;`

13. **What is text-align, direction, text decoration, text transform, line height, letter spacing, word spacing, white space: pre, word break: break all?**
    - `text-align`: Aligns text (left, right, center).
    - `text-decoration`: Adds decoration (underline, overline, line-through).
    - `text-transform`: Modifies text capitalization (uppercase, lowercase).
    - `line-height`: Sets the height of a line of text.
    - `letter-spacing`: Adjusts space between characters.
    - `word-spacing`: Adjusts space between words.
    - `white-space: pre`: Preserves whitespace.
    - `word-break: break-all`: Allows breaking long words.

14. **What is box-shadow and text-shadow properties?**
    - `box-shadow` adds shadows to elements.
    - `text-shadow` adds shadows to text.

15. **What is link and their properties?**
    - `<a>` is used to create hyperlinks.
    - Properties include color, text-decoration, and hover effects.

16. **What is font and its attributes and properties?**
    - `font-family`: Defines the font.
    - `font-size`: Sets the font size.
    - `font-weight`: Specifies the font thickness (bold, normal).

17. **What is cursor in CSS?**
    - `cursor` property defines the cursor style when hovering over an element.
    - Example: `cursor: pointer;`

18. **What is opacity?**
    - `opacity` property sets the transparency level of an element.
    - Example: `opacity: 0.5;`

19. **What is filter?**
    - `filter` property applies graphical effects like blur or grayscale.
    - Example: `filter: blur(5px);`

20. **What is gradient?**
    - CSS gradients create a smooth transition between two or more colors.
    - Examples: linear-gradient, radial-gradient.

21. **What is visibility?**
    - `visibility` property determines if an element is visible or hidden.
    - Example: `visibility: hidden;`

22. **What is position?**
    - `position` property defines the positioning method for an element.
    - Values include static, relative, absolute, fixed, and sticky.

23. **What is overflow?**
    - `overflow` property controls what happens if an element's content is larger than its box.
    - Values include visible, hidden, scroll, and auto.

24. **What is resizable?**
    - The `resize` property allows users to resize an element, like textarea or iframe.
    - Example: `resize: both;`

25. **What are lists?**
    - Lists are used to present information in a structured way.
    - Types include ordered (`<ol>`), unordered (`<ul>`), and definition (`<dl>`).

26. **What are functions in CSS?**
    - CSS functions manipulate values, such as `rgba()` for setting color with alpha transparency.
    - Example: `color: rgba(255, 0, 0, 0.5);`

27. **What are units, absolute, and relative in CSS?**
    - Units include pixels (`px`), percentages (`%`), and em.
    - Absolute units (in, cm) are fixed-size.
    - Relative units (em, rem) are relative to other properties.

28. **What is initial vs. inherit?**
    - `initial` sets a property to its default value.
    - `inherit` inherits the property from its parent element.

29. **What is box sizing in CSS?**
    - `box-sizing` property controls how the box model works.
    - Values include `content-box` and `border-box`.

30. **What is object-fit property in CSS?**
    - `object-fit` property specifies how an element's content should be resized to fit its container.
    - Values include `fill`, `contain`, `cover`, etc.

31. **What is a pseudo-element?**
    - Pseudo-elements are used to style certain parts of an element.
    - Example: `::before` and `::after`.

32. **What is layer and z-index?**
    - Layers in CSS refer to stacking contexts created by z-index.
    - `z-index` sets the stacking order of positioned elements.

33. **What is float and clear?**
    - `float` property places an element

 on the left or right side, allowing text to wrap around it.
    - `clear` property specifies which sides of an element are not allowed to be adjacent to floating elements.

34. **What are tables in CSS?**
    - Tables in CSS allow for custom styling of table elements.
    - Styles can be applied to `<table>`, `<tr>`, `<td>`, etc.

35. **What is CSS Flexbox?**
    - Flexbox is a layout model providing an efficient way to design complex layouts.
    - It enables alignment and distribution of space within a container.

36. **How does CSS Flexbox work?**
    - Flexbox uses flex containers and flex items.
    - Properties like `display: flex`, `flex-direction`, and `justify-content` control the layout.

37. **What is CSS Grid?**
    - CSS Grid is a layout model that allows for two-dimensional layout control.
    - It defines both columns and rows in a grid.

38. **How does Grid work in CSS?**
    - CSS Grid uses a grid container and grid items.
    - Properties like `grid-template-columns` and `grid-template-rows` define the grid structure.

39. **What are CSS animations?**
    - CSS animations allow for the gradual change of an element's style.
    - Keyframes and the `animation` property control animations.

40. **What is transform, transition, and animations?**
    - `transform` applies 2D or 3D transformations to an element.
    - `transition` creates smooth transitions between different property values.
    - `animation` controls animations using keyframes.

41. **What is responsive design?**
    - Responsive design ensures a web application's layout adjusts to different screen sizes.
    - It provides an optimal viewing experience on various devices.

42. **How can we give responsiveness to our website?**
    - Use media queries to apply different styles based on screen characteristics.
    - Design a flexible layout using relative units and fluid grids.

43. **What is media queries?**
    - Media queries apply styles based on characteristics like screen width, height, or device orientation.
    - Example: `@media screen and (max-width: 600px) { ... }`

44. **How can we obtain responsiveness using media queries?**
    - Adjust styles for different screen sizes using `@media` rules.
    - Use breakpoints to apply specific styles to specific screen widths.

45. **Which is the best method for responsiveness?**
    - The best method depends on the project requirements and the developer's preference.
    - Common approaches include mobile-first design, flexbox, and grid.

46. **What is Bootstrap?**
    - Bootstrap is a popular front-end framework for building responsive and mobile-first web projects.
    - It includes a set of pre-designed components and styles.

47. **How can responsiveness be obtained from Bootstrap?**
    - Bootstrap provides a responsive grid system and predefined classes for styling.
    - It also includes responsive utilities and components for building responsive websites.
