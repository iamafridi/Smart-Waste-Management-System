# Smart Waste Management System

## Overview

The Smart Waste Management System is a Java-based application designed to streamline waste management processes through real-time monitoring, bin management, and eco-point tracking. This application features a graphical user interface (GUI) to allow easy interaction with different functionalities, including system status monitoring, bin management, eco-points management, and report generation.

## Features

- **System Status Monitoring**: View the current system status including CPU usage, memory usage, and disk space availability.
- **Bin and Route Management**: Manage and view information related to waste bins and their collection routes.
- **Eco-Points Management**: Track eco-points, rewards, and related activities.
- **Report Generation**: Generate comprehensive reports on waste collection, bin management, and eco-points.

 
Below are some screenshots of the application:

   ![Screenshot 2024-09-12 000607](https://github.com/user-attachments/assets/7dfa0f67-e160-4fa1-a22b-76dba488e028)
![Screenshot 2024-09-12 000542](https://github.com/user-attachments/assets/9acbed77-d917-468e-b6e5-8ed3505e1130)
![Screenshot 2024-09-12 000515](https://github.com/user-attachments/assets/b39e3105-095c-4af9-9775-fa519aab5558)
![Screenshot 2024-09-12 000414](https://github.com/user-attachments/assets/517246eb-2a89-4bed-92b9-7b4a3f9cdb85)

   

## Installation

To run this application, follow these steps:

1. **Clone the Repository**
    
    git clone https://github.com/iamafridi/SmartWasteManagement.git
    
2. **Navigate to the Project Directory**
    
    cd SmartWasteManagement
    
3. **Compile the Code**
    
    javac -d bin src/*.java src/gui/*.java
    
4. **Run the Application**
    
    java -cp bin gui.SmartWasteManagementSystemGUI
    

## File Structure

- `src/`: Contains the source code files for the application.
  - `SystemAdmin.java`: Defines the `SystemAdmin` class with methods for managing the system.
  - `SmartWasteManagementSystem.java`: Contains the main logic for the Smart Waste Management System.
- `src/gui/`: Contains the GUI-related files.
  - `SmartWasteManagementSystemGUI.java`: Provides the GUI for interacting with the system.
- `bin/`: Directory where the compiled class files are placed.

## Usage

Once the application is running, you can interact with the following features through the GUI:

- **Monitor System Status**: Click the corresponding button to view real-time system statistics.
- **Manage Bins and Routes**: Click to see the current status of bins and routes.
- **Manage Eco-Points**: View information about eco-points and rewards.
- **Generate Reports**: Generate and view reports based on system data.

## Example Data

The application includes simulated data to provide a dynamic experience:
- **System Status**: CPU Usage, Memory Usage, Disk Space
- **Bin Management**: Total Bins, Bins Collected Today, Routes Optimized
- **Eco-Points Management**: Total Eco-Points, Points Awarded Today, Rewards Distributed
- **Report**: Total Waste Collected, Total Bins Collected, Routes Optimized, Eco-Points Awarded

## Contributing

Contributions are welcome! If you have suggestions, improvements, or bug fixes, please create a pull request or open an issue on GitHub.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

For any questions or inquiries, please contact Website:iamafridi.netilify.app.

