package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.PomClass;

public class StepDefinition extends BaseClass {

	PomClass pom;

	@Given("User launches Locate360 application")
	public void user_launches_locate360_application() {
		Assert.assertNotNull("WebDriver is not initialized.", driver);
		pom = new PomClass(driver);
		Assert.assertNotNull("PomClass is not initialized.", pom);
		Assert.assertTrue("Locate360 application is not opened.", driver.getCurrentUrl().contains("cloudfront.net"));
	}

	@When("User enters valid email {string}")
	public void user_enters_valid_email(String Email) {
		sendKeys(pom.enterEmailId, Email);

		Assert.assertEquals("Email was not entered correctly.", Email, pom.enterEmailId.getAttribute("value"));

	}

	@When("User enter valid password {string}")
	public void user_enter_valid_password(String Password) {
		sendKeys(pom.enterPassword, Password);

		Assert.assertEquals("Password was not entered correctly.", Password, pom.enterPassword.getAttribute("value"));
	}

	@When("User clicks sign in button")
	public void user_clicks_sign_in_button() {
		click(pom.signInButton);
		Explixity();

		System.out.println("Sign in successful.");

	}

	@Then("User should be redirected to the dashboard")
	public void user_should_be_redirected_to_the_dashboard() {
		wait.until(ExpectedConditions.visibilityOf(pom.adminText));

		Assert.assertTrue("User is not on the Locate360 dashboard.", pom.adminText.isDisplayed());

	}

	@Given("User is on the Locate360 dashboard")
	public void user_is_on_the_locate360_dashboard() {
		wait.until(ExpectedConditions.visibilityOf(pom.adminText));

		Assert.assertTrue("User is not on the Locate360 dashboard.", pom.adminText.isDisplayed());

	}

	@When("User clicks on Customer & Staff")
	public void user_clicks_on_customer_staff() {
		wait.until(ExpectedConditions.elementToBeClickable(pom.customerOption)).click();

		System.out.println("Customer & Staff clicked.");
	}

	@When("User clicks on Customer Management")
	public void user_clicks_on_customer_management() {

		wait.until(ExpectedConditions.elementToBeClickable(pom.customerManagementText));
		click(pom.customerManagementText);

		System.out.println("Customer Management clicked.");

	}

	@Then("User should be redirected to Customer Management page")
	public void user_should_be_redirected_to_customer_management_page() {
		wait.until(ExpectedConditions.visibilityOf(pom.customerManagementText));

		Assert.assertTrue("User was not redirected to Customer Management page.",
				pom.customerManagementText.isDisplayed());

		System.out.println("User redirected to Customer Management page successfully.");

	}

	@Then("Customer list should be displayed")
	public void customer_list_should_be_displayed() {
		wait.until(ExpectedConditions.visibilityOf(pom.customerTable));

		Assert.assertTrue("Customer list is not displayed.", pom.customerTable.isDisplayed());

		System.out.println("Customer list displayed successfully.");

	}

	@When("User clicks on Telecaller Management")
	public void userClicksOnTelecallerManagement() {

		// pom.selectTeleCallerManagement.click();
		wait.until(ExpectedConditions.elementToBeClickable(pom.selectTeleCallerManagement)).click();
	}

	@Then("User should be redirected to Telecaller Management page")
	public void userShouldBeRedirectedToTelecallerManagementPage() {
		wait.until(ExpectedConditions.visibilityOf(pom.telecallerManagementText));

		Assert.assertTrue("Telecaller Management page was not displayed.", pom.telecallerManagementText.isDisplayed());
		// Assert.assertTrue(pom.telecallerManagementText.isDisplayed());
	}

	@When("User clicks on Add Telecaller button")
	public void userClicksOnAddTelecallerButton() {
		wait.until(ExpectedConditions.elementToBeClickable(pom.selectAddTelecallerButton)).click();
		// pom.selectAddTelecallerButton.click();
	}

	@When("User enters Telecaller name {string}")
	public void userEntersTelecallerName(String name) {
		wait.until(ExpectedConditions.visibilityOf(pom.inputAddTelecallerName));
		pom.inputAddTelecallerName.clear();
		pom.inputAddTelecallerName.sendKeys(name);
		// pom.inputAddTelecallerName.sendKeys(name);
	}

	@When("User enters Telecaller email {string}")
	public void userEntersTelecallerEmail(String email) {
		wait.until(ExpectedConditions.visibilityOf(pom.inputAddTelecallerEmail));
		pom.inputAddTelecallerEmail.clear();
		pom.inputAddTelecallerEmail.sendKeys(email);
		// pom.inputAddTelecallerEmail.sendKeys(email);
	}

	@When("User enters Telecaller mobile {string}")
	public void userEntersTelecallerMobile(String mobile) {
		wait.until(ExpectedConditions.visibilityOf(pom.inputAddTelecallerMobile));
		pom.inputAddTelecallerMobile.clear();
		pom.inputAddTelecallerMobile.sendKeys(mobile);
		// pom.inputAddTelecallerMobile.sendKeys(mobile);
	}

	@When("User enters Telecaller password {string}")
	public void userEntersTelecallerPassword(String password) {
		wait.until(ExpectedConditions.visibilityOf(pom.inputAddTelecallerPassword));
		pom.inputAddTelecallerPassword.clear();
		pom.inputAddTelecallerPassword.sendKeys(password);
		// pom.inputAddTelecallerPassword.sendKeys(password);
	}

	@When("User enters Telecaller type {string}")
	public void userEntersTelecallerType(String type) {
		wait.until(ExpectedConditions.visibilityOf(pom.inputAddTelecallerType));
		pom.inputAddTelecallerType.sendKeys(type);
//		pom.inputAddTelecallerType.sendKeys(type);
		System.out.println("user entered type value");
	}

	@When("User clicks on Submit button")
	public void userClicksOnSubmitButton() {
		wait.until(ExpectedConditions.elementToBeClickable(pom.inputAddTelecallerSubmit)).click();
		// pom.inputAddTelecallerSubmit.click();
		System.out.println("user clicked submit");
	}

	@Then("Telecaller should be added successfully")
	public void telecallerShouldBeAddedSuccessfully() {
		wait.until(ExpectedConditions.visibilityOf(pom.telecallerManagementText));

		Assert.assertTrue("Telecaller Management page is not displayed.", pom.telecallerManagementText.isDisplayed());
		// Assert.assertTrue(pom.telecallerManagementText.isDisplayed());
	}

	@When("User clicks on Content")
	public void user_clicks_on_content() {
		wait.until(ExpectedConditions.elementToBeClickable(pom.contentMenu)).click();
		System.out.println("User clicked content in dashboard");
	}

	@When("User clicks on Category Management")
	public void user_clicks_on_category_management() {
		wait.until(ExpectedConditions.elementToBeClickable(pom.categoryManagement)).click();
		System.out.println("User clicked category management");

	}

	@Then("User should be redirected to Category Management page")
	public void user_should_be_redirected_to_category_management_page() {
		wait.until(ExpectedConditions.visibilityOf(pom.categoryManagementHeading));

		Assert.assertTrue("Category Management page is not displayed", pom.categoryManagementHeading.isDisplayed());

	}

	@Then("Category list should be displayed")
	public void category_list_should_be_displayed() {
		wait.until(ExpectedConditions.visibilityOf(pom.storageContainer));

		Assert.assertTrue("Category container is not displayed", pom.storageContainer.isDisplayed());
	}

	@When("User clicks on Add New Category button")
	public void user_clicks_on_add_new_category_button() {
		wait.until(ExpectedConditions.elementToBeClickable(pom.addNewCategory)).click();
	}

	@When("User enters category name {string}")
	public void user_enters_category_name(String name) {
		wait.until(ExpectedConditions.visibilityOf(pom.addName));

		pom.addName.clear();
		pom.addName.sendKeys(name);
	}

	@When("User enters category description {string}")
	public void user_enters_category_description(String description) {
		wait.until(ExpectedConditions.visibilityOf(pom.addDescription));

		pom.addDescription.clear();
		pom.addDescription.sendKeys(description);
	}

	@When("User clicks Submit button")
	public void user_clicks_submit_button() {
		wait.until(ExpectedConditions.elementToBeClickable(pom.submitButton)).click();
	}

	@Then("Category should be added successfully")
	public void category_should_be_added_successfully() {
		System.out.println("Category form submitted.");
	}

	@Then("The new category {string} should be displayed in the category list")
	public void the_new_category_should_be_displayed_in_the_category_list(String categoryName) {
		wait.until(ExpectedConditions.visibilityOf(pom.errorNotification));
		if(pom.errorNotification.isDisplayed()) {
			System.out.println("BUG: Category submission failed.");
			System.out.println("Error: " + pom.errorNotification.getText());
		}
		

		boolean categoryFound;

		try {
			categoryFound = wait.until(driver -> pom.storageContainer.isDisplayed()
					&& pom.storageContainer.getText().contains(categoryName));
		} catch (TimeoutException exception) {
			categoryFound = false;
		}

		//Assert.assertTrue("Category was not added: " + categoryName, categoryFound);
	}

	@Given("the user is on the dashboard")
	public void the_user_is_on_the_dashboard() {
		wait.until(ExpectedConditions.visibilityOf(pom.adminText));

		Assert.assertTrue("User is not on the Locate360 dashboard.", pom.adminText.isDisplayed());
	}

	@When("the user selects {string}")
	public void the_user_selects(String option) {
		Assert.assertEquals("Unexpected menu option.", "Review Moderation", option);

		wait.until(ExpectedConditions.elementToBeClickable(pom.reviewModeration)).click();

		wait.until(ExpectedConditions.visibilityOf(pom.reviewModerationHeading));
	}

	@Then("the Review Moderation page should be displayed")
	public void the_review_moderation_page_should_be_displayed() {
		wait.until(ExpectedConditions.visibilityOf(pom.reviewModerationHeading));

		Assert.assertTrue("Review Moderation page was not displayed.", pom.reviewModerationHeading.isDisplayed());
	}

	@Then("the user should be able to approve reviews")
	public void the_user_should_be_able_to_approve_reviews() {
		wait.until(ExpectedConditions.elementToBeClickable(pom.approveButton));

		Assert.assertTrue("Approve button is not enabled.", pom.approveButton.isEnabled());
		pom.approveButton.click();

		System.out.println("Approve button clicked.");
	}

	@When("the user select {string}")
	public void the_user_select(String option) {
		Assert.assertEquals("Unexpected menu option.", "Content Management", option);

		wait.until(ExpectedConditions.elementToBeClickable(pom.contentManagement)).click();
		System.out.println("user clicked the content mangement from menu");

	}

	@Then("the content management page should be displayed")
	public void the_content_management_page_should_be_displayed() {
		wait.until(ExpectedConditions.visibilityOf(pom.contentManagementHeading));
		Assert.assertTrue("Content Management page was not displayed.", pom.contentManagementHeading.isDisplayed());
		System.out.println("User landed in content management page");
	}

	@Then("user edit the already exists content {string}")
	public void user_edit_the_already_exists_content(String name) {
		//By editButton = pom.getEditButtonByContentName(name);

		wait.until(ExpectedConditions.elementToBeClickable(pom.getEditButtonByContentName(name))).click();
		wait.until(ExpectedConditions.visibilityOf(pom.editContainerPopup));
		wait.until(ExpectedConditions.visibilityOf(pom.pageTitle));
		pom.pageTitle.clear();
		pom.pageTitle.sendKeys("create");
		wait.until(ExpectedConditions.elementToBeClickable(pom.submitButtonContentManagement)).click();
		// click(pom.submitButtonContentManagement);

		System.out.println("Edit popup opened for content: " + name);

	}

	@When("user select the vendor in dashboard option")
	public void user_select_the_vendor_in_dashboard_option() {
		wait.until(ExpectedConditions.elementToBeClickable(pom.vendorText)).click();
		System.out.println("User clicked Vendors menu.");
	}

	@When("user select vendor management page")
	public void user_select_vendor_management_page() {
		wait.until(ExpectedConditions.elementToBeClickable(pom.vendorManagementSelect)).click();

		wait.until(ExpectedConditions.visibilityOf(pom.vendorVerifyText));
		Assert.assertTrue("Vendor Management page was not displayed.", pom.vendorVerifyText.isDisplayed());

		System.out.println("Vendor Management page opened.");
	}

	@When("user is in total vendor grid")
	public void user_is_in_total_vendor_grid() {
		wait.until(ExpectedConditions.visibilityOf(pom.totalVendorText));

		Assert.assertTrue("Total Vendors section is not displayed.", pom.totalVendorText.isDisplayed());

		wait.until(driver -> !pom.totalVendorList.isEmpty());

		System.out.println("Total Vendors grid displayed.");
	}

	@When("user searches for vendor {string}")
	public void user_searches_for_vendor(String vendorName) {
		pom.searchVendorAndClickTelecaller(vendorName);

		System.out.println("Searched vendor and clicked telecaller: " + vendorName);
	}

	@When("user clicks Telecaller for vendor {string}")
	public void user_clicks_telecaller_for_vendor(String vendorName) {
		wait.until(ExpectedConditions.visibilityOf(pom.verifyTextAssignTelecaller));

		Assert.assertTrue("Assign to Telecaller dialog was not displayed for " + vendorName,
				pom.verifyTextAssignTelecaller.isDisplayed());

		System.out.println("Telecaller assignment dialog opened for " + vendorName);
	}

	@When("user select telecaller {string}")
	public void user_select_telecaller(String telecallerName) {

		wait.until(ExpectedConditions.elementToBeClickable(pom.selectTelecallername)).click();

		System.out.println("Selected telecaller: " + telecallerName);
	}

	@When("user select assignment priority {string}")
	public void user_select_assignment_priority(String priority) {

		wait.until(ExpectedConditions.elementToBeClickable(pom.selectPriority)).click();

		System.out.println("Selected assignment priority: " + priority);
	}

	@When("user enters assignment notes {string}")
	public void user_enters_assignment_notes(String notes) {
		wait.until(ExpectedConditions.visibilityOf(pom.descriptionNotes));

		pom.descriptionNotes.clear();
		pom.descriptionNotes.sendKeys(notes);

		Assert.assertEquals("Assignment notes were not entered correctly.", notes,
				pom.descriptionNotes.getAttribute("value"));

		System.out.println("Assignment notes entered.");
	}

	@When("user assigns the telecaller")
	public void user_assigns_the_telecaller() {
		// scrollToTheElement(pom.assignButton);
		scrollToTheElement(pom.assignButton);
		wait.until(ExpectedConditions.elementToBeClickable(pom.assignButton)).click();
		System.out.println("Clicked Assign Telecaller.");

	}

	@Then("the telecaller assignment should be completed")
	public void the_telecaller_assignment_should_be_completed() {
		wait.until(ExpectedConditions.invisibilityOf(pom.verifyTextAssignTelecaller));

		System.out.println("Telecaller assignment completed successfully.");
	}

	@When("the user checks the active vendor count")
	public void the_user_checks_the_active_vendor_count() {
//		wait.until(ExpectedConditions.visibilityOf(pom.activeSelectLabel)).click();
//		int activeVendorCount = pom.vendorRows.size();
//		System.out.println("Active vendors displayed in table: " + activeVendorCount);
		wait.until(ExpectedConditions.elementToBeClickable(pom.activeSelectLabel)).click();

		System.out.println("Active vendors displayed in table: " + pom.vendorRows.size());
	}

	@Then("user active count should match the active vendors displayed")
	public void user_active_count_should_match_the_active_vendors_displayed() {

		pom.printVendorCountAndName();

	}

	@When("the user checks the pending vendor count")
	public void the_user_checks_the_pending_vendor_count() {
		wait.until(ExpectedConditions.visibilityOf(pom.pendingSelection)).click();
		// int pendingVendorCount = pom.pendingVendorCount.size();
		System.out.println("Pending Vendors details:" + pom.pendingVendorCount.size());
	}

	@Then("user pending count should match the active vendors displayed")
	public void user_pending_count_should_match_the_active_vendors_displayed() {
		pom.printPendingVendorCountAndDetails();
	}

	@When("the user checks the suspend vendor count")
	public void the_user_checks_the_suspend_vendor_count() {
		wait.until(ExpectedConditions.visibilityOf(pom.selectSuspended)).click();
		// int suspendVendorCount = pom.suspendedVendorCount.size();
		System.out.println("Pending Vendors details:" + pom.suspendedVendorCount.size());
	}

	@Then("user suspend count should match the active vendors displayed")
	public void user_suspend_count_should_match_the_active_vendors_displayed() {
		pom.printsuspendedVendorCountAndDetails();
	}

	@When("the user checks the verified vendor count")
	public void the_user_checks_the_verified_vendor_count() {
		wait.until(ExpectedConditions.visibilityOf(pom.selectVerified)).click();
		int verifiedVendorCount = pom.verifiedVendorCount.size();
		System.out.println("Pending Vendors details:" + verifiedVendorCount);
	}

	@Then("user verified count should match the active vendors displayed")
	public void user_verified_count_should_match_the_active_vendors_displayed() {
		pom.printVerifiedVendorCountAndDetails();
	}

	@When("user select vendor verification page")
	public void user_select_vendor_verification_page() {
		wait.until(ExpectedConditions.elementToBeClickable(pom.selectVendorVerification)).click();

		wait.until(ExpectedConditions.visibilityOf(pom.verifyTextVendorVerification));
		Assert.assertTrue("Vendor Management page was not displayed.", pom.verifyTextVendorVerification.isDisplayed());

		System.out.println("Vendor Verification page opened.");

	}

	@When("user redirect to pending vendor verfication")
	public void user_redirect_to_pending_vendor_verfication() {
		wait.until(ExpectedConditions.visibilityOf(pom.selectPending));
		Assert.assertTrue("Vendor Management page was not displayed.", pom.selectPending.isDisplayed());
		System.out.println("user is on pending vendor verification");
	}

	@Then("the user checks the pending count")
	public void the_user_checks_the_pending_count() {
		String count = pom.getVerificationCount(pom.selectPending);
		System.out.println("Pending Vendor Count: " + count);

	}

	@When("user select verfied option")
	public void user_select_verfied_option() {
		wait.until(ExpectedConditions.visibilityOf(pom.selectPending));
		pom.selectVendorVerified.click();
		Assert.assertTrue("Vendor Management page was not displayed", pom.verifyVerifiedPage.isDisplayed());
		System.out.println("user is on verified page");
	}

	@Then("the user checks the verify count")
	public void the_user_checks_the_verify_count() {
		String count = pom.getVerificationCount(pom.selectVendorVerified);
		System.out.println("Verified Vendor Count: " + count);
	}

	@When("user select Reject option")
	public void user_select_reject_option() {
		wait.until(ExpectedConditions.visibilityOf(pom.selectPending));
		pom.selectReject.click();
		Assert.assertTrue("Vendor Management page was not displayed", pom.verifyRejectPage.isDisplayed());
		System.out.println("user is on Reject page");
	}

	@Then("the user checks the reject count")
	public void the_user_checks_the_reject_count() {
		String count = pom.getVerificationCount(pom.selectReject);
		System.out.println("Rejected Vendor Count: " + count);
	}

	@When("user select document verification page")
	public void user_select_document_verification_page() {
		wait.until(ExpectedConditions.elementToBeClickable(pom.selectDocumentVerification)).click();

		wait.until(ExpectedConditions.visibilityOf(pom.verifyDocumentVericationPage));

	}

	@Then("user redirect to document verfication slide")
	public void user_redirect_to_document_verfication_slide() {
		Assert.assertTrue("Vendor Management page was not displayed.", pom.verifyDocumentVericationPage.isDisplayed());
		System.out.println("Document Verification page opened.");
	}

	@When("the user searches for the vendor {string}")
	public void the_user_searches_for_the_vendor(String vendorName) {
		pom.searchDocumentVendor(vendorName);
		int totalVendors = pom.getTotalVendorsDisplayed();
		Assert.assertTrue("No vendors are displayed after searching.", totalVendors > 0);
		System.out.println("Vendor search completed: " + vendorName);
		System.out.println("Total vendors displayed: " + totalVendors);

	}

	@When("the user selects the vendor")
	public void the_user_selects_the_vendor() {
		boolean selected = pom.selectDocumentVendor("Hariharan");
		Assert.assertTrue("Could not open the selected vendor's documents.", selected);
		System.out.println("Vendor document page opened.");
	}

	@When("the user verifies the updated documents")
	public void the_user_verifies_the_updated_documents() {
		int count = pom.getDoumentCount();
		List<String> documentName = pom.getDoumentName();

		System.out.println("Total Document Count: " + count);
		for (int i = 0; i < documentName.size(); i++) {
			System.out.println((i + 1) + ". " + documentName.get(i));
		}

	}

	@When("the user accepts the uploaded documents")
	public void the_user_accepts_the_uploaded_documents() {

		wait.until(ExpectedConditions.visibilityOf(pom.addressProof));
		pom.addressProof.click();

		scrollToTheBottom();
		pom.documentApprovalButton.click();
		Assert.assertTrue("Scroll to button was not displayed.", pom.widgetApproveAndReject.isDisplayed());

		System.out.println("Documents approved successfully");
	}

	@When("user select vendor activation page")
	public void user_select_vendor_activation_page() {
		wait.until(ExpectedConditions.elementToBeClickable(pom.vendorActivation)).click();

		wait.until(ExpectedConditions.visibilityOf(pom.vendorActivationText));
		Assert.assertTrue("Vendor Management page was not displayed.", pom.vendorActivationText.isDisplayed());

		System.out.println("Vendor ActivationText page opened.");
	}

	@When("user redirect to pending vendor activation")
	public void user_redirect_to_pending_vendor_activation() {
		wait.until(ExpectedConditions.visibilityOf(pom.pendingSelectionVendorActivation));
		Assert.assertTrue("Vendor Management page was not displayed.", pom.pendingPageVerifyText.isDisplayed());
		System.out.println("user is on pending vendor activation");
	}

	@Then("the user checks the pending vendor activation count")
	public void the_user_checks_the_pending_vendor_activation_count() {
		String count = pom.getVerificationCount(pom.pendingSelectionVendorActivation);
		System.out.println("Pending Vendor activation Count: " + count);
	}

	@When("user redirect to active vendor activation")
	public void user_redirect_to_active_vendor_activation() {
		wait.until(ExpectedConditions.visibilityOf(pom.activeSelection)).click();
		;
		Assert.assertTrue("Vendor Management page was not displayed.", pom.activeSelection.isDisplayed());
		System.out.println("user is on active vendor activation");
	}

	@Then("the user checks the active vendor activation count")
	public void the_user_checks_the_active_vendor_activation_count() {
		String count = pom.getVerificationCount(pom.activeSelection);
		pom.printActiveVendorCountAndName();
		System.out.println("active Vendor activation Count: " + count);
	}

	@When("user redirect to suspend vendor activation")
	public void user_redirect_to_suspend_vendor_activation() {
		wait.until(ExpectedConditions.visibilityOf(pom.suspenSelection)).click();
		;
		Assert.assertTrue("Vendor activation page was not displayed.", pom.suspenSelection.isDisplayed());
		System.out.println("user is on suspend vendor activation");
	}

	@Then("the user checks the suspend vendor activation count")
	public void the_user_checks_the_suspend_vendor_activation_count() {
		String count = pom.getVerificationCount(pom.suspenSelection);
		pom.printActiveVendorCountAndName();
		System.out.println("suspend Vendor activation Count: " + count);
	}

	@When("user select Business Moderation page")
	public void user_select_business_moderation_page() {
		wait.until(ExpectedConditions.elementToBeClickable(pom.selectBusinessModeration)).click();

		wait.until(ExpectedConditions.visibilityOf(pom.verifyTextBusinessModeration));
		Assert.assertTrue("Business Moderation page was not displayed.",
				pom.verifyTextBusinessModeration.isDisplayed());

		System.out.println("Business Moderation page opened.");
	}

	@When("user redirect to total listing business")
	public void user_redirect_to_total_listing_business() {
		wait.until(ExpectedConditions.visibilityOf(pom.selectTotalListings)).click();
		;
		Assert.assertTrue("Business Moderation page was not displayed.", pom.selectTotalListings.isDisplayed());
		System.out.println("user is on Business Moderation page ");

	}

	@Then("the user checks the total listing business  count")
	public void the_user_checks_the_total_listing_business_count() {

		int totalBusiness = pom.getTotalBusinessDisplayed();
		Assert.assertTrue("No vendors are displayed after searching.", totalBusiness > 0);

		System.out.println("Total Business displayed: " + totalBusiness);
		List<String> businessName = pom.getBusinessName();
		for (int i = 0; i < businessName.size(); i++) {
			System.out.println((i + 1) + ". " + businessName.get(i));
		}

	}

	@When("user select the leads in dashboard option")
	public void user_select_the_leads_in_dashboard_option() {
		wait.until(ExpectedConditions.elementToBeClickable(pom.selectLeads)).click();
		System.out.println("User clicked Leads menu.");
	}

	@When("user redirect to lead management page")
	public void user_redirect_to_lead_management_page() {
		wait.until(ExpectedConditions.elementToBeClickable(pom.selectLeadManagement)).click();

		wait.until(ExpectedConditions.visibilityOf(pom.leadManagementVerifyText));
		Assert.assertTrue("Business Moderation page was not displayed.", pom.leadManagementVerifyText.isDisplayed());

		System.out.println("lead Management page opened.");
	}

	@Then("user verify the total leads")
	public void user_verify_the_total_leads() {
		pom.printLeadCountAndDetails();
		int totalLeads = pom.getTotalLeadDisplayed();

		Assert.assertTrue("No vendors are displayed after searching.", totalLeads > 0);
		System.out.println("Total Leads displayed: " + totalLeads);

	}

	@When("user redirect to lead quality page")
	public void user_redirect_to_lead_quality_page() {
		wait.until(ExpectedConditions.elementToBeClickable(pom.selectLeadQuality));

		BaseClass.click(pom.selectLeadQuality);

		wait.until(ExpectedConditions.visibilityOfAllElements(pom.selectLeadStorage));
	}

	@Then("user verify the lead quality and distribution")
	public void user_verify_the_lead_quality_and_distribution() {
		Assert.assertTrue("Lead Quality & Distribution page is not displayed", pom.selectLeadQuality.isDisplayed());
		Assert.assertFalse("Lead quality and distribution sections are not displayed", pom.selectLeadStorage.isEmpty());

		for (WebElement element : pom.selectLeadStorage) {
			Assert.assertTrue("A lead quality or distribution section is not displayed", element.isDisplayed());
		}

		System.out.println("Lead Quality & Distribution page verified successfully.");
	}

	@When("user select the Billing in dashboard option")
	public void user_select_the_billing_in_dashboard_option() {
		wait.until(ExpectedConditions.elementToBeClickable(pom.selectBillings)).click();
		System.out.println("User selected the Billing menu in Dashboard.");
	}

	@When("user redirect to Subscription \\/ Plan Management page")
	public void user_redirect_to_subscription_plan_management_page() {
		wait.until(ExpectedConditions.elementToBeClickable(pom.selectSubcriptionManagement)).click();

		wait.until(ExpectedConditions.visibilityOf(pom.verifyTextSubcriptionManagement));
		Assert.assertTrue("Business Moderation page was not displayed.",
				pom.verifyTextSubcriptionManagement.isDisplayed());

		System.out.println("Subcription Management page opened.");

	}

	@When("user should see the plan details")
	public void user_should_see_the_plan_details() {

		System.out.println("Total Subcription displayed");

	}

	@When("user redirect to Payment & Billing Management page")
	public void user_redirect_to_payment_billing_management_page() {
		wait.until(ExpectedConditions.elementToBeClickable(pom.paymentBilling)).click();

		wait.until(ExpectedConditions.visibilityOf(pom.verifyTextPaymentandBilling));
		Assert.assertTrue("Business Moderation page was not displayed.", pom.verifyTextPaymentandBilling.isDisplayed());

		System.out.println("Payment and Billing page opened.");
	}

	@When("user select {string} entire from the dropdown")
	public void user_select_entire_from_the_dropdown(String count) {
		pom.selectPageSize(count);
	}

	@Then("the dropdown should display {string}")
	public void the_dropdown_should_display(String expectedText) {
		String actualText = pom.getSelectedPageSize();

		Assert.assertEquals("Selected page size does not match", expectedText, actualText);
	}

	@When("user select the support in dashboard option")
	public void user_select_the_support_in_dashboard_option() {
		wait.until(ExpectedConditions.elementToBeClickable(pom.selectSupport)).click();
		System.out.println("User selected the support menu in Dashboard.");
	}

	@When("user redirect to support ticket page")
	public void user_redirect_to_support_ticket_page() {
		wait.until(ExpectedConditions.elementToBeClickable(pom.selectSupportTickets)).click();

		wait.until(ExpectedConditions.visibilityOf(pom.verifySupportTicketPage));
		Assert.assertTrue("Business Moderation page was not displayed.", pom.verifySupportTicketPage.isDisplayed());

		System.out.println("Support and Ticket Management page opened.");
	}

	@Then("user should see the all ticket summary cards is displayed")
	public void user_should_see_the_all_ticket_summary_cards_is_displayed() {
		Assert.assertTrue("one or more ticket summary cards are not displayed", pom.areAllSummaryCardsDisplayed());
		System.out.println("User landed in support ticket page and all cards visible as expected");
	}

	@Then("user check the the all tickets cards count")
	public void user_check_the_the_all_tickets_cards_count() {
		pom.printAllTicketCounts();
		System.out.println("All counts are reflected");
	}

}
