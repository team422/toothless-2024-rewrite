// Copyright 2021-2024 FRC 6328
// http://github.com/Mechanical-Advantage
//
// This program is free software; you can redistribute it and/or
// modify it under the terms of the GNU General Public License
// version 3 as published by the Free Software Foundation or
// available in the root directory of this project.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU General Public License for more details.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static final class Ports {
    public static final int pigeonPort = 23;

    public static final int intakeMotorPort = 4;

    public static final int wristMotorPort = 5;
    public static final int wristThroughborePort = 4;

    public static final int elevatorLeaderMotorPort = 1;
    public static final int elevatorFollowerMotorPort = 2;

    public static final int elevatorThroughBoreEncoderPortA = 1;
    public static final int elevatorThroughBoreEncoderPortB = 0;

    // Left Front Ports
    public static final int leftFrontDrivingMotorPort = 12;
    public static final int leftFrontTurningMotorPort = 7;
    public static final int leftFrontCanCoderPort = 18;

    // Right Front Ports
    public static final int rightFrontDriveMotorPort = 6;
    public static final int rightFrontTurningMotorPort = 39;
    public static final int rightFrontCanCoderPort = 17;

    // Left Rear Ports
    public static final int leftRearDriveMotorPort = 9;
    public static final int leftRearTurningMotorPort = 11;
    public static final int leftRearCanCoderPort = 16;

    // Right Rear Ports
    public static final int rightRearDriveMotorPort = 3;
    public static final int rightRearTurningMotorPort = 8;
    public static final int rightRearCanCoderPort = 15;
  }

  public static final Mode currentMode = Mode.REAL;

  public static enum Mode {
    /** Running on a real robot. */
    REAL,

    /** Running a physics simulator. */
    SIM,

    /** Replaying from a log file. */
    REPLAY
  }
}
