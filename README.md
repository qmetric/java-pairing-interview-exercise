# Insurance Premium Calculator

## Introduction
In this exercise, we'd like to understand your problem-solving abilities and collaboration skills. It's essential that you communicate effectively, ask clarifying questions as needed, and notify us of any simplifications you'd like to make outside the provided requirements.

**NOTE:** We do not necessarily expect you to complete the entire exercise; instead, we're interested in observing your progress and understanding the approach you take.

## Scenario
You are tasked with developing a calculator for a company that needs to compute the cost of home insurance premiums, referred to as `homePremium`. The `homePremium` is determined based on number of bedrooms, customer's age and credit score.

## Requirements
These are applied in order
1. The base `homePremium` for any home is £100 per bedroom.
2. If the customer is over 60 years old, the base `homePremium` of the home should increase by 20%.
3. If the customer's credit score is below 600, the `homePremium` increases by 15%.

#### Examples
| **Name**        | **Date of Birth** | **Credit Score** | **Home Built** | **Home Number of Bedrooms** | **Premium Price** |
|-----------------|-------------------|------------------|----------------|-----------------------------|-------------------|
| Justin Case     | 20/05/1990        | 900              | 1990           | 2                           | 200               |
| Sherlock Homes  | 04/03/1957        | 700              | 1940           | 4                           | 480               |
| Polly C. Holder | 11/12/1930        | 550              | 1930           | 4                           | 552               |

### Inputs
A customer profile that includes:
- Customer's name
- Customer's date of birth
- Customer's credit score
- Year the home was built
- Number of bedrooms in the home

### Output
The price of the insurance policy, expressed as a number with up to 2 decimal places. No currency is specified.

### Simplifications
- Ignore any currency concerns.

## Instructions
- Develop the above requirements in a way that reflects your typical development process.
- You can modify any existing code except for the output code using `println()`, which is deemed adequate as the output mechanism. The remaining code serves as a guideline for your implementation.
- Feel free to add, modify, or delete classes as needed for your implementation. Here's a summary of the existing classes:
  - `Main`: Outputs the calculated premiums.
  - `HomePremium`: Manages the calculation of the premium.
  - `CustomerProfile`: Contains all necessary details for premium calculation.
  - `Customer`: Holds the customer's personal information.
  - `Home`: Stores information about the home.
- Your objective is to build a solution that is verifiable and extensible.

## Possible Future Requirement 
4. An additional £20 premium will be added for each decade (10 years) that the home is older than 1980.

### Adjusted Examples
| **Name**        | **Date of Birth** | **Credit Score** | **Home Built** | **Home Number of Bedrooms** | **Premium Price** |
|-----------------|-------------------|------------------|----------------|-----------------------------|-------------------|
| Justin Case     | 20/05/1990        | 900              | 1990           | 2                           | 200               |
| Sherlock Homes  | 04/03/1957        | 700              | 1940           | 4                           | 640               |
| Polly C. Holder | 11/12/1930        | 550              | 1930           | 4                           | 732               |
