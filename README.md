# Android EMS Calibration Control App

This Android application facilitates the calibration of Electric Muscle Stimulation (EMS) devices by allowing control over three key properties: intensity, frequency, and pulse width. EMS calibration is crucial for ensuring proper functionality, as it is not one size fits all. This application streamlines the calibration process by enabling users to adjust these properties directly from their Android smartwatch.

## Features
- **Intensity Control**: Users can adjust the intensity level of the EMS signal.
- **Frequency Adjustment**: The application allows users to modify the frequency of the EMS signal.
- **Pulse Width Editing**: Users can edit the pulse width of the EMS signal to meet their specific needs.

## Wireless Control
The application communicates with an Arduino microcontroller via Bluetooth. To set up the communication, please ensure to edit the UUID in the code to match your microcontroller's UUID.

If you're using Arduino code provided by the repository owner, you can find it linked [Here](https://github.com/archit10101/Arduino_BLE)


## Usage
To utilize this application, follow these steps:

1. Install the application on your Android smartwatch.
2. Ensure that your smartwatch supports Bluetooth communication.
3. Edit the UUID in the application code to match your Arduino microcontroller's UUID.
4. Open the application and navigate to the EMS calibration control interface.
5. Adjust the intensity, frequency, and pulse width as needed.
6. Confirm the changes, and they will be wirelessly transmitted to the EMS device via the Arduino microcontroller.

## Note
This application aims to simplify the calibration process of EMS devices by providing convenient control options directly from a smartwatch interface. Make sure to edit the UUID in the application code before using it with your Arduino microcontroller.

For additional information or inquiries, please refer to the documentation or contact the repository owner.

**Disclaimer**: This application is provided as-is without any warranty. Use it responsibly and at your own risk.

---

Contributions and feedback are highly appreciated! Please feel free to open an issue or submit a pull request for any enhancements or suggestions.
