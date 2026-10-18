# SJF-Preemptive-FCFS

A Java application project focused on CPU process scheduling, with a repository title referencing **Shortest Job First (SJF) Preemptive** and **First-Come, First-Served (FCFS)** scheduling algorithms.

## Overview

CPU scheduling is an important operating systems concept that determines how processes are selected for execution. Different scheduling algorithms affect process waiting time, turnaround time, and the order in which processes receive CPU time.

This project provides a starting point for exploring CPU scheduling concepts through a Java application. Confirm the exact algorithms and functionality against the current source code before treating this description as a complete feature list.

## Scheduling Algorithms

### First-Come, First-Served (FCFS)

FCFS schedules processes in the order they arrive in the ready queue. It is a non-preemptive algorithm: once a process begins execution, it continues until it finishes or otherwise yields the CPU.

### Preemptive Shortest Job First (SJF)

Preemptive SJF, commonly called Shortest Remaining Time First (SRTF), selects the available process with the shortest remaining execution time. A running process may be interrupted when another eligible process has a shorter remaining time.

## Technologies and Project Structure

The repository contains a Java application source directory, a compiled-output directory, and a JavaFX-related build configuration file.

- **Java:** Application programming language.
- **JavaFX-related project configuration:** Indicated by `build.fxbuild`.
- **Source directory:** `src/application/`
- **Application output directory:** `bin/application/`

The exact Java version, JavaFX version, build process, and dependencies should be confirmed from the project configuration.

## Requirements

Before running the application, verify the following:

- A compatible Java Development Kit (JDK)
- JavaFX libraries or SDK, if required by the project
- An IDE or build environment compatible with the project's configuration

## How to Run

1. Clone or download this repository.
2. Open the project in an IDE that supports its Java and JavaFX configuration.
3. Inspect `build.fxbuild` and the source files under `src/application/`.
4. Configure any required JavaFX libraries and dependencies.
5. Build and run the application's main class as defined by the project.

**Note:** Exact build and launch commands are not included here because the available repository information does not establish the required Java version, main class, or build configuration.

## Learning Objectives

This project can support learning about:

- Operating systems and CPU scheduling
- FCFS scheduling
- Preemptive SJF / SRTF scheduling
- Process arrival and burst times
- Waiting time and turnaround time
- Java application development

## Author

**Ichiro Yamazaki**

## License

No license has been specified for this repository.
