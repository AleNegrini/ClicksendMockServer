# Clicksend Mock Server

[![License](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)

The Clicksend Mock Server is a Kotlin Spring Boot project designed to mimic the behavior of the Clicksend API for testing purposes. It utilizes Kotlin and Spring Boot technologies to create a mock server environment. This project is built with Maven and employs Detekt for static code analysis. You can find the documentation for the Clicksend API [here](https://developers.clicksend.com/docs/rest/v3/#ClickSend-v3-API-SMS).

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Coding guidelines](#coding-guidelines)
- [Contributing](#contributing)
- [License](#license)

## Installation

To install the Clicksend Mock Server, follow these steps:

1. Clone this repository to your local machine.
2. Navigate to the project directory.
3. Run `./mvnw clean install` to build the project and install dependencies.
4. Run `java -jar target/clicksend-mock-server-<version>-SNAPSHOT.jar` to start the server.

## Usage

Once the server is running, you can interact with it as you would with the actual Clicksend API.
Refer to Swagger UI (http://localhost:8080/swagger-ui/index.html) for REST endpoint details and payload formats.

Currently, the mocked API available are:

| URI Path      | Description | Official doc                                                        |
|---------------|-------------|---------------------------------------------------------------------|
| _v3/sms/send_ | Send SMS    | https://developers.clicksend.com/docs/rest/v3/#ClickSend-v3-API-SMS |

## Coding Guidelines

### Source code 

To ensure consistency and maintainability of our codebase, we adhere to a set of coding guidelines enforced by the `detekt` tool (https://detekt.dev/). 
These guidelines are specified in the detekt configuration file (`detekt.yml`) located in the root directory of this project.

We highly recommend installing the `detekt` plugin for your IDE to ensure real-time feedback on adherence to our coding guidelines. 
You can find installation instructions for various IDEs.

Alternately, you can run `./mvnw detekt:check` directly from any terminal to assess a code quality check.

Any deviations from these guidelines will result in build failures, ensuring that our codebase remains consistent and maintainable.

## Contributing

Contributions to the Clicksend Mock Server project are welcome! If you encounter any bugs, have suggestions for improvements, or would like to contribute new features, please open an issue or submit a pull request following the guidelines outlined in [CONTRIBUTING.md](CONTRIBUTING.md).

## License

This project is licensed under the [MIT License](LICENSE). You are free to modify and distribute this code as you see fit. See the [LICENSE](LICENSE) file for more details.
