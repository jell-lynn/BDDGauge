# BDDGauge

This repository contains the source code for **BDD Testing using the Gauge tool**, developed as part of the *Agile Software Development* course.

## Overview

The project demonstrates **Behavior-Driven Development (BDD)** for the **User Login** feature using the [Gauge](https://gauge.org/) testing framework. It includes specifications that simulate real-world scenarios for logging into a system.

## Feature: User Login

### User Story

As a registered user,  
I want to log in to my account,  
So that I can access my dashboard.

### Scenarios

#### Scenario 1: Successful Login

**Given** I am a registered user  
**And** I have navigated to the login page  
**When** I enter my valid username and password  
**And** I click on the "Login" button  
**Then** I should be redirected to the dashboard  
**And** I should see a welcome message

#### Scenario 2: Unsuccessful Login with Incorrect Password

**Given** I am a registered user  
**And** I have navigated to the login page  
**When** I enter my valid username but an incorrect password  
**And** I click on the "Login" button  
**Then** I should see an error message saying "Invalid credentials"  
**And** I should remain on the login page

#### Scenario 3: Login with Empty Fields

**Given** I am on the login page  
**When** I leave the username and password fields empty  
**And** I click on the "Login" button  
**Then** I should see an error message saying "Username and Password are required"

## Tools Used

- **Gauge** – for writing and executing BDD-style acceptance tests
- **Java** – primary programming language for test implementation
- **Gradle** – for project build and dependency management

## Setup Instructions

1. Clone the repository:
   ```bash
   git clone https://github.com/jell-lynn/BDDGauge.git

2. Navigate to the project directory:
   ```bash
   cd bddgauge
   
3. Run the tests using Gauge:
   ```bash
   gauge run specs


