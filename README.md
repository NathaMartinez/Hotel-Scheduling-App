D387 - Advanced Java
C1a. Build resource bundles for both English and French (languages required by Canadian law). Include a welcome message in the language resource bundles.
File Name(s): welcome.properties; welcome_CA.properties; welcome_en_US.properties
Line Number(s): none; 1; 1
Changes: Build English and French resource bundles and include a welcome message for each language.

C1b. Display the welcome message in both English and French by applying the resource bundles using a different thread for each language.
File Name(s): SearchBundle.java; WelcomeController.java; app.component.ts; app.component.html
Line Number(s): 1-21; 1-32; 18-21,33,90-101; 19
Changes: Create class to parse resource bundles and add to String array. Build REST controller to create endpoints for each message. Add method to fetch welcome message response from API endpoint. Display welcome messages in the frontend and update welcome messages.

C2. Modify the front end to display the price for a reservation in currency rates for U.S. dollars ($), Canadian dollars (C$), and euros (€) on different lines.
File Name(s): app.component.html
Line Number(s): 80-82
Changes: Display price for room reservations

C3a. Write a Java method to convert times between eastern time (ET), mountain time (MT), and coordinated universal time (UTC) zones.
File Name(s): TimeZoneConverter.java
Line Number(s): 1-43
Change(Copy from commits): create time zone conversion method

C3b. Use the time zone conversion method from part C3a to display a message stating the time in all three times zones in hours and minutes for an online, live presentation held at the Landon Hotel. The times should be displayed as ET, MT, and UTC.
File Name(s): TimeZoneConverter.java; TimeZoneController.java; app.component.ts, app.component.html
Line Number(s): 6,10-12,19,20,26,29-31,36-51,53-58; 1-21; 20,35,91-102; 29-30
Changes: Add formatted Eastern, Mountain, and Universal Time zones. Create REST controller for mapping API endpoints for the TimeZoneConverter class. Map array to an API endpoint. Create method to fetch presentation message from API endpoint, display message on home page.
