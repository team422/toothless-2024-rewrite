package frc.robot.oi;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class DriverControlsXbox implements DriverControls {
  private CommandXboxController m_controller;

  public DriverControlsXbox(int port) {
    m_controller = new CommandXboxController(port);
  }

  public double getDriveForward() {
    return m_controller.getLeftY();
  }

  public double getDriveLeft() {
    return m_controller.getLeftX();
  }

  public double getDriveRotation() {
    return m_controller.getRightX();
  }
}
