# Smart Waste Management System

## Overview

The Smart Waste Management System is a Java-based application designed to streamline waste management processes through real-time monitoring, bin management, and eco-point tracking. This application features a graphical user interface (GUI) to allow easy interaction with different functionalities, including system status monitoring, bin management, eco-points management, and report generation.

## Features

- **System Status Monitoring**: View the current system status including CPU usage, memory usage, and disk space availability.
- **Bin and Route Management**: Manage and view information related to waste bins and their collection routes.
- **Eco-Points Management**: Track eco-points, rewards, and related activities.
- **Report Generation**: Generate comprehensive reports on waste collection, bin management, and eco-points.

 
Below are some screenshots of the application:

<table>
  <tr>
    <td>
      <img src="![Screenshot 2024-09-12 000542](https://github.com/user-attachments/assets/91e32cf5-706d-4893-bf00-8319d6615b4a)" alt="System Status Monitoring" width="300"/>
    </td>
    <td>
      <img src="![Screenshot 2024-09-12 000607](https://github.com/user-attachments/assets/f0aa5a76-118c-4755-ae01-92a9b6ad0435)" alt="Manage Bins and Routes" width="300"/>
    </td>
  </tr>
  <tr>
    <td>
      <img src="![Screenshot 2024-09-12 000515](https://github.com/user-attachments/assets/70191b42-bc2c-4fba-a080-aeee65d1aa8e)" alt="Manage Eco-Points" width="300"/>
    </td>
    <td>
      <img src="![Screenshot 2024-09-12 000414](https://github.com/user-attachments/assets/a732baef-8fd8-4cc6-897e-e55aebdaabd3)" alt="Generate Reports" width="300"/>
    </td>
  </tr>
</table>


## Installation

To run this application, follow these steps:

1. **Clone the Repository**
    
    git clone https://github.com/yourusername/SmartWasteManagement.git
    
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

