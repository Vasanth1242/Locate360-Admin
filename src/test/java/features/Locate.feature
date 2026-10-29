Feature: Locate360 Customer Management

  Background:
    Given User launches Locate360 application
    When User enters valid email "rajasekargopi.kiaq@gmail.com"
    And User enter valid password "Locate@360"
    And User clicks sign in button
    Then User should be redirected to the dashboard

  @Login
  Scenario: Successful login with valid credentials
    Then User should be redirected to the dashboard

  @customer
  Scenario: User navigates to Customer Management
    When User clicks on Customer & Staff
    And User clicks on Customer Management
    Then User should be redirected to Customer Management page
    Then Customer list should be displayed

  @telecaller
  Scenario: User adds a new Telecaller
    When User clicks on Customer & Staff
    And User clicks on Telecaller Management
    Then User should be redirected to Telecaller Management page
    When User clicks on Add Telecaller button
    And User enters Telecaller name "Test Telecaller"
    And User enters Telecaller email "testtelecaller@gmail.com"
    And User enters Telecaller mobile "9876543210"
    And User enters Telecaller password "Test@123"
    And User enters Telecaller type "Telecaller"
    And User clicks on Submit button
    Then Telecaller should be added successfully

  @category
  Scenario: User adds a new category
    When User clicks on Content
    And User clicks on Category Management
    Then User should be redirected to Category Management page
    And Category list should be displayed
    When User clicks on Add New Category button
    And User enters category name "Test Category"
    And User enters category description "This is a test category description"
    And User clicks Submit button
    Then Category should be added successfully
    And The new category "Test Category" should be displayed in the category list

  @review
  Scenario: User navigates to Review Moderation to approve reviews
    Given the user is on the dashboard
    When User clicks on Content
    And the user selects "Review Moderation"
    Then the Review Moderation page should be displayed
    And the user should be able to approve reviews

  @Management
  Scenario: User navigates to content Management
    Given the user is on the dashboard
    When User clicks on Content
    And the user select "Content Management"
    Then the content management page should be displayed

  @Management1
  Scenario: User edit the content management
    Given the user is on the dashboard
    When User clicks on Content
    And the user select "Content Management"
    Then user edit the already exists content "create"

  @VendorManagement
  Scenario: search business and assign a telecaller
    Given the user is on the dashboard
    When user select the vendor in dashboard option
    And user select vendor management page
    And user is in total vendor grid
    And user searches for vendor "Hariharan"
    And user clicks Telecaller for vendor "Hariharan"
    And user select telecaller "Telecallersjana"
    And user select assignment priority "Immediate"
    And user enters assignment notes "Follow up with vendor"
    And user assigns the telecaller
    Then the telecaller assignment should be completed

  @VendorManagement1
  Scenario: Verify active vendor
    Given the user is on the dashboard
    When user select the vendor in dashboard option
    And user select vendor management page
    And the user checks the active vendor count
    Then user active count should match the active vendors displayed

  @VendorManagement2
  Scenario: Verify pending vendor
    Given the user is on the dashboard
    When user select the vendor in dashboard option
    And user select vendor management page
    And the user checks the pending vendor count
    Then user pending count should match the active vendors displayed

  @VendorManagement3
  Scenario: Verify suspend vendor
    Given the user is on the dashboard
    When user select the vendor in dashboard option
    And user select vendor management page
    And the user checks the suspend vendor count
    Then user suspend count should match the active vendors displayed

  @VendorManagement4
  Scenario: Verify verified vendor
    Given the user is on the dashboard
    When user select the vendor in dashboard option
    And user select vendor management page
    And the user checks the verified vendor count
    Then user verified count should match the active vendors displayed

  @VendorVerification
  Scenario: Verify vendor verification module pending
    Given the user is on the dashboard
    When user select the vendor in dashboard option
    And user select vendor verification page
    And user redirect to pending vendor verfication
    Then the user checks the pending count

  @VendorVerification1
  Scenario: Verify vendor verification module pending
    Given the user is on the dashboard
    When user select the vendor in dashboard option
    And user select vendor verification page
    And user redirect to pending vendor verfication
    And user select verfied option
    Then the user checks the verify count

  @VendorVerification2
  Scenario: Verify vendor verification module pending
    Given the user is on the dashboard
    When user select the vendor in dashboard option
    And user select vendor verification page
    And user redirect to pending vendor verfication
    And user select Reject option
    Then the user checks the reject count

  @DocumentVerification
  Scenario: Verify Document verification flow
    Given the user is on the dashboard
    When user select the vendor in dashboard option
    And user select document verification page
    Then user redirect to document verfication slide

  @DocumentVerification1
  Scenario: Verify the document verification flow
    Given the user is on the dashboard
    When user select the vendor in dashboard option
    And user select document verification page
    And the user searches for the vendor "Hariharan"
    And the user selects the vendor
    And the user verifies the updated documents
    And the user accepts the uploaded documents

  @VendorActivation
  Scenario: Verify Vendor Activation module pending
    Given the user is on the dashboard
    When user select the vendor in dashboard option
    And user select vendor activation page
    And user redirect to pending vendor activation
    Then the user checks the pending vendor activation count

  @VendorActivation1
  Scenario: Verify Vendor Activation module active
    Given the user is on the dashboard
    When user select the vendor in dashboard option
    And user select vendor activation page
    And user redirect to active vendor activation
    Then the user checks the active vendor activation count

  @VendorActivation2
  Scenario: Verify Vendor Activation module suspend
    Given the user is on the dashboard
    When user select the vendor in dashboard option
    And user select vendor activation page
    And user redirect to suspend vendor activation
    Then the user checks the suspend vendor activation count

  @BusinessModeration
  Scenario: Verify Vendor Business Moderation module
    Given the user is on the dashboard
    When user select the vendor in dashboard option
    And user select Business Moderation page
    And user redirect to total listing business
    Then the user checks the total listing business  count

  @Leads
  Scenario: Verify Leads module
    Given the user is on the dashboard
    When user select the leads in dashboard option
    And user redirect to lead management page
    Then user verify the total leads

  @Leads1
  Scenario: Verify Leads module
    Given the user is on the dashboard
    When user select the leads in dashboard option
    And user redirect to lead quality page
    Then user verify the lead quality and distribution

  @Billing
  Scenario: Verify Billing module
    Given the user is on the dashboard
    When user select the Billing in dashboard option
    And user redirect to Subscription / Plan Management page
    And user should see the plan details

  @Billing1
  Scenario: Verify Billing module
    Given the user is on the dashboard
    When user select the Billing in dashboard option
    And user redirect to Payment & Billing Management page
    And user select "<count>" entire from the dropdown
    Then the dropdown should display "Show <count>"

    Examples:
      | count |
      | 5     |
      | 10    |
      | 20    |
      | 50    |

  @support
  Scenario: verify support ticket management
    Given the user is on the dashboard
    When user select the support in dashboard option
    And user redirect to support ticket page
    Then user should see the all ticket summary cards is displayed
    
    @support1
    Scenario: verify support ticket management
    Given the user is on the dashboard
    When user select the support in dashboard option
    And user redirect to support ticket page
    Then user check the the all tickets cards count
    
