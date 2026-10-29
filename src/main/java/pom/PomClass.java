package pom;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;

public class PomClass extends BaseClass {

	public WebDriverWait wait;

	public PomClass(WebDriver driver) {
		PomClass.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@FindBy(name = "email")
	public WebElement enterEmailId;

	@FindBy(name = "password")
	public WebElement enterPassword;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement signInButton;

	@FindBy(xpath = "//div[normalize-space()='Admin Panel']")
	public WebElement adminText;

	@FindBy(xpath = "//span[normalize-space()='CUSTOMER & STAFF']")
	public WebElement customerOption;

	@FindBy(xpath = "//h1[normalize-space()='Customer Management']")
	public WebElement customerManagementText;

	@FindBy(xpath = "//table[@class='w-full  text-left']")
	public WebElement customerTable;

	@FindBy(xpath = "//span[normalize-space()='Customer Enquiries']")
	public WebElement customerEnquirieText;

	@FindBy(xpath = "//input[@name='input']")
	public WebElement searchBoxEnquiries;

	@FindBy(xpath = "//div[@class=\'flex flex-col\']/span[normalize-space()='Vishwa']")
	public WebElement selectCustomerName;

	@FindBy(xpath = "//div[@class='flex gap-2']/button[normalize-space()='Telecaller'][1]")
	public WebElement selectTelecaller;

	@FindBy(xpath = "//span[normalize-space()='Telecaller Management']")
	public WebElement selectTeleCallerManagement;

	@FindBy(xpath = "//h1[normalize-space()='Telecaller Management']")
	public WebElement telecallerManagementText;

	@FindBy(xpath = "//button[@class=\'flex items-center bgcolor-77 hover:scale-105 cursor-pointer mt-3 rounded-lg px-4 py-2 t-color-3 gap-2 \']")
	public WebElement selectAddTelecallerButton;

	@FindBy(xpath = "//input[@name='name']")
	public WebElement inputAddTelecallerName;

	@FindBy(xpath = "//input[@placeholder='Enter email']")
	public WebElement inputAddTelecallerEmail;

	@FindBy(xpath = "//input[@name='mobile']")
	public WebElement inputAddTelecallerMobile;

	@FindBy(xpath = "//input[@name='password']")
	public WebElement inputAddTelecallerPassword;

	@FindBy(xpath = "//input[@name='type']")
	public WebElement inputAddTelecallerType;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement inputAddTelecallerSubmit;

	@FindBy(xpath = "//span[normalize-space()='CONTENT']")
	public WebElement contentMenu;

	@FindBy(xpath = "//*[normalize-space()='Category Management']")
	public WebElement categoryManagement;

	@FindBy(xpath = "//*[normalize-space()='Category & Subcategory Management']")
	public WebElement categoryManagementHeading;

	@FindBy(xpath = "//button[contains(.,'Add Category')]")
	public WebElement addNewCategory;

	@FindBy(xpath = "//input[@name='categoryName']")
	public WebElement addName;

	@FindBy(xpath = "//input[@name='description']")
	public WebElement addDescription;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement submitButton;

	// @FindBy(xpath = "//div[@class='mx-2']")
	@FindBy(xpath = "//div[@class='flex justify-between']")
	public WebElement storageContainer;

	// @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast-theme--light
	// Toastify__toast--error']")
	@FindBy(xpath = "//div[@class='flex items-center justify-between mb-5']")
	public WebElement errorNotification;

	@FindBy(xpath = "//*[normalize-space()='Review Moderation']")
	public WebElement reviewModeration;

	@FindBy(xpath = "//*[normalize-space()='Review & Rating Moderation']")
	public WebElement reviewModerationHeading;

	@FindBy(xpath = "//button[contains(normalize-space(.), 'Approve')]")
	public WebElement approveButton;

	@FindBy(xpath = "//button[contains(normalize-space(.), 'Reject')]")
	public WebElement rejectButton;

	@FindBy(xpath = "//span[normalize-space()='Content Management']")
	public WebElement contentManagement;

	@FindBy(xpath = "//*[normalize-space()='Content Management System']")
	public WebElement contentManagementHeading;

	@FindBy(xpath = "//*[contains(normalize-space(), 'iuytre')]/button[normalize-space()='Edit Page']")
	public WebElement editContainer;

	@FindBy(xpath = "//div[contains(@class, 'w-[55%]')]")
	public WebElement editContainerPopup;

	@FindBy(xpath = "//*[@placeholder= 'e.g About Us, FAQ...']")
	public WebElement pageTitle;

//	@FindBy(xpath = "//*[contains(normalize-space(), 'Create') or @placeholder='About Us' or @placeholder='FAQ']")
//	public WebElement pageTitle;

	@FindBy(xpath = "//*[@class='w-full py-2 rounded-lg bg-gradient-to-r from-green-500 to-green-700']")
	public WebElement submitButtonContentManagement;

	@FindBy(xpath = "//*[@class=\"w-full py-2 rounded-lg bg-red-500 hover:bg-red-600 transition']")
	public WebElement cancelButtonContentManagement;

	@FindBy(xpath = "//span[normalize-space()='VENDORS']")
	public WebElement vendorText;

	@FindBy(xpath = "//span[normalize-space()='Vendor Management']")
	public WebElement vendorManagementSelect;

	@FindBy(xpath = "//p[normalize-space()='Vendor Management']")
	public WebElement vendorVerifyText;

	@FindBy(xpath = "//p[normalize-space()='Total Vendors']")
	public WebElement totalVendorText;

	@FindBy(xpath = "//input[@placeholder= 'Search' or @placeholder= 'Search Vendors....']")
	public WebElement searchBarTotalVendor;

	@FindBy(xpath = "//div[@class='w-full overflow-x-auto  rounded-xl bordercol-3  ']")
	public List<WebElement> totalVendorList;

	@FindBy(xpath = "//tr[.//*[normalize-space()='Hariharan']]//button[normalize-space(.)='Telecaller']")
	public WebElement travelBusinessAndTelecaller;

	@FindBy(xpath = "//button[normalize-space(.)='Telecaller']")
	public WebElement telecallerButton;

	@FindBy(xpath = "//*[normalize-space()='Assign to Telecaller']")
	public WebElement verifyTextAssignTelecaller;

	@FindBy(xpath = "//h3[normalize-space()='Telecallersjana']")
	public WebElement selectTelecallername;

	@FindBy(xpath = "//button[normalize-space()='Immediate']")
	public WebElement selectPriority;

	@FindBy(xpath = "//textarea[@placeholder='Add special instructions...']")
	public WebElement descriptionNotes;

	@FindBy(xpath = "//button[normalize-space(.)='Assign Telecaller']")
	public WebElement assignButton;

	@FindBy(xpath = "//p[normalize-space()='Active']")
	public WebElement activeSelectLabel;

	@FindBy(xpath = "//table/tbody/tr")
	public List<WebElement> vendorRows;

	@FindBy(xpath = "//table/tbody/tr/td[.]")
	public List<WebElement> activeVendorCount;

	@FindBy(xpath = "//p[normalize-space()='Pending']")
	public WebElement pendingSelection;

	@FindBy(xpath = "//table/tbody/tr")
	public List<WebElement> pendingVendorCount;

	@FindBy(xpath = "//table/tbody/tr/td[.]")
	public List<WebElement> pendingCount;

	@FindBy(xpath = "//p[normalize-space()='Suspended']")
	public WebElement selectSuspended;

	@FindBy(xpath = "//table/tbody/tr")
	public List<WebElement> suspendedVendorCount;

	@FindBy(xpath = "//table/tbody/tr/td[.]")
	public List<WebElement> suspendedCount;

	@FindBy(xpath = "//p[normalize-space()='Verified']")
	public WebElement selectVerified;

	@FindBy(xpath = "//table/tbody/tr")
	public List<WebElement> verifiedVendorCount;

	@FindBy(xpath = "//table/tbody/tr/td[.]")
	public List<WebElement> verifiedCount;

	@FindBy(xpath = "//span[normalize-space()='Vendor Verification']")
	public WebElement selectVendorVerification;

	@FindBy(xpath = "//h1[contains(normalize-space(), 'Vendor Verification')]")
	public WebElement verifyTextVendorVerification;

	@FindBy(xpath = "//button[contains(normalize-space(), 'Pending')]")
	public WebElement selectPending;

	@FindBy(xpath = "//button[contains(normalize-space(), 'Verified')]")
	public WebElement selectVendorVerified;

	@FindBy(xpath = "//p[contains(normalize-space(), 'No Verified vendors')]")
	public WebElement verifyVerifiedPage;

	@FindBy(xpath = "//button[contains(normalize-space(), 'Reject')]")
	public WebElement selectReject;

	@FindBy(xpath = "//p[contains(normalize-space(), 'No Reject vendors')]")
	public WebElement verifyRejectPage;

	@FindBy(xpath = "//span[normalize-space()='Document Verification']")
	public WebElement selectDocumentVerification;

	@FindBy(xpath = "//p[normalize-space()='Document Verification']")
	public WebElement verifyDocumentVericationPage;

	@FindBy(xpath = "//input[@placeholder='Search vendors by name...']")
	public WebElement searchBarInDocumentVerication;

	@FindBy(xpath = "//h1[contains(normalize-space(),'Documents from ')]")
	public WebElement verifyTextAfterClickVendor;

	@FindBy(xpath = "//*[@class='font-bold text-xl text-white']")
	public List<WebElement> vendorNameElements;

	@FindBy(xpath = "//div[contains(@class,'border-b ') and contains(@class,'border-white/10')]")
	public List<WebElement> documentVendorRows;

	@FindBy(xpath = "//h1[contains(normalize-space(),'ALL')]")
	public WebElement optionAll;

	@FindBy(xpath = "//h1[normalize-space()='PENDING']")
	public WebElement optionPending;

	@FindBy(xpath = "//h1[normalize-space()='APPROVED']")
	public WebElement optionApproved;

	@FindBy(xpath = "//h1[normalize-space()='REJECTED']")
	public WebElement optionRejected;

	@FindBy(xpath = "//h1[contains(@class, 'font-semibold') and contains(@class, 'text-lg')]")
	public List<WebElement> overallDocument;

	@FindBy(xpath = "//div[contains(@class, 'justify-between cursor-pointer transition') and contains(., 'Address Proof')]")
	public WebElement addressProof;

	@FindBy(xpath = "//div[@class='mt-4 rounded-xl border border-yellow-500/20 bg-yellow-500/10 px-4 py-3']")
	public WebElement widgetApproveAndReject;

	@FindBy(xpath = "//button[normalize-space(.)='Approve']")
	public WebElement documentApprovalButton;

	@FindBy(xpath = "//button[normalize-space(.)='Reject']")
	public WebElement documentRejectButton;

	@FindBy(xpath = "//p[normalize-space(.)='Download original']")
	public WebElement documentDownloadButton;

	@FindBy(xpath = "//span[normalize-space(.)='Vendor Activation']")
	public WebElement vendorActivation;

	@FindBy(xpath = "//h1[normalize-space(.)='Vendor Activation']")
	public WebElement vendorActivationText;

	@FindBy(xpath = "//p[normalize-space(.)='No vendors in Pending']")
	public WebElement pendingPageVerifyText;

	@FindBy(xpath = "//button[contains(normalize-space(), 'Pending') and @class='px-4 py-1.5 rounded-full text-md font-medium transition-all bg-[#dd52c3] text-white shadow-lg shadow-purple-500/20']")
	public WebElement pendingSelectionVendorActivation;

	@FindBy(xpath = "//button[contains(., 'Active') and contains(@class, 'rounded-full')]")
	public WebElement activeSelection;

	@FindBy(xpath = "//span[@class='font-semibold text-white text-md']")
	public List<WebElement> activeListVendor;

	@FindBy(xpath = "//button[contains(., 'Suspend') and contains(@class, 'rounded-full')]")
	public WebElement suspenSelection;

	@FindBy(xpath = "//span[normalize-space(.)='Business Moderation']")
	public WebElement selectBusinessModeration;

	@FindBy(xpath = "//p[normalize-space(.)='Business Listing Moderation']")
	public WebElement verifyTextBusinessModeration;

	@FindBy(xpath = "//p[normalize-space(.)='Total Listings']")
	public WebElement selectTotalListings;

	@FindBy(xpath = "//div[@class='p-3 px-4 text-md t-color-3']")
	public List<WebElement> storageContainerBusiness;

	@FindBy(xpath = "//span[normalize-space()='LEADS']")
	public WebElement selectLeads;

	@FindBy(xpath = "//span[normalize-space()='Lead Management']")
	public WebElement selectLeadManagement;

	@FindBy(xpath = "//h1[normalize-space()='Lead Management']")
	public WebElement leadManagementVerifyText;

	@FindBy(xpath = "//p[normalize-space()='Total Leads']")
	public WebElement totalLeads;

	@FindBy(xpath = "//div[@class=\"w-full overflow-x-auto  rounded-xl bordercol-3  \"]")
	public List<WebElement> leadStorageContainer;

	@FindBy(xpath = "//table/tbody/tr")
	public List<WebElement> leadTable;

	@FindBy(xpath = "//table/tbody/tr/td[.]")
	public List<WebElement> leadTableList;

	@FindBy(xpath = "//span[normalize-space()='Lead Quality & Distribution']")
	public WebElement selectLeadQuality;

	@FindBy(xpath = "//div[@class=\"p-5 pb-4\"]")
	public List<WebElement> selectLeadStorage;

	@FindBy(xpath = "//span[normalize-space()='BILLINGS']")
	public WebElement selectBillings;

	@FindBy(xpath = "//span[normalize-space()='Subscription Management']")
	public WebElement selectSubcriptionManagement;

	@FindBy(xpath = "//p[normalize-space()='Subscription / Plan Management']")
	public WebElement verifyTextSubcriptionManagement;

	@FindBy(xpath = "//div[contains(@class, 'backdrop-blur-xl') and contains(@class, 'relative min-w-[50px] min-h-[520px] flex flex-col transition-all duration-300  bgcolor-82 backdrop-blur-xl bordercol-2 shadow-lg rounded-xl p-6')]")
	public List<WebElement> containerSubcription;

	@FindBy(xpath = "//span[normalize-space()='Payments & Billings']")
	public WebElement paymentBilling;

	@FindBy(xpath = "//h1[normalize-space()='Payment & Billing Management']")
	public WebElement verifyTextPaymentandBilling;

	@FindBy(xpath = "//table/tbody/tr")
	public List<WebElement> paymentBillingTable;

	@FindBy(xpath = "//table/tbody/tr")
	public List<WebElement> paymentBillingTableValue;

	@FindBy(xpath = "//select[.//option[contains(.,'Show 5')]]")
	public WebElement showEntiredDropdown;

	@FindBy(xpath = "//span[normalize-space()='SUPPORT']")
	public WebElement selectSupport;

	@FindBy(xpath = "//span[normalize-space()='Support Tickets']")
	public WebElement selectSupportTickets;

	@FindBy(xpath = "//div[normalize-space()='Support / Ticket Management']")
	public WebElement verifySupportTicketPage;

	@FindBy(xpath = "//*[normalize-space()='All Tickets']/..")
	public WebElement allTicketCard;

	@FindBy(xpath = "//*[normalize-space()='Open Tickets']/..")
	public WebElement openTicketsCard;

	@FindBy(xpath = "//*[normalize-space()='In Progress Tickets']/..")
	public WebElement inProgressTicketsCard;

	@FindBy(xpath = "//*[normalize-space()='Resolved']/..")
	public WebElement resolvedCard;

	@FindBy(xpath = "//*[normalize-space()='Closed Tickets']/..")
	public WebElement closedTicketCards;

	public By getEditButtonByContentName(String contentName) {
		return By.xpath("//*[contains(normalize-space(), '" + contentName + "')]"
				+ "/ancestor::*[.//button[normalize-space()='Edit Page']][1]"
				+ "//button[normalize-space()='Edit Page']");
	}

	public void searchVendorAndClickTelecaller(String vendorName) {
		wait.until(ExpectedConditions.visibilityOf(searchBarTotalVendor));
		searchBarTotalVendor.clear();
		searchBarTotalVendor.sendKeys(vendorName);
		searchBarTotalVendor.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(travelBusinessAndTelecaller)).click();

	}

	public void printVendorCountAndName() {
		wait.until(ExpectedConditions.visibilityOfAllElements(vendorRows));
		System.out.println("Total Active Vendors Displayed: " + vendorRows);
		wait.until(ExpectedConditions.visibilityOfAllElements(activeVendorCount));
		for (WebElement vendorName : activeVendorCount) {
			System.out.println("Vendor Name: " + vendorName.getText().trim());

		}
	}

	public void printActiveVendorCountAndName() {
		wait.until(ExpectedConditions.visibilityOfAllElements(activeListVendor));
		System.out.println("Total Active Vendors activation Displayed: " + activeListVendor);
		wait.until(ExpectedConditions.visibilityOfAllElements(activeListVendor));
		for (WebElement activeListVendor : activeListVendor) {
			System.out.println("Vendor Name: " + activeListVendor.getText().trim());

		}
	}

	public void printPendingVendorCountAndDetails() {
		wait.until(ExpectedConditions.visibilityOfAllElements(suspendedVendorCount));
		System.out.println("Total Pending Vendors Displayed: " + suspendedVendorCount);
		wait.until(ExpectedConditions.visibilityOfAllElements(pendingCount));
		for (WebElement pendingVendorName : pendingCount) {
			System.out.println("Pending Vendor Name: " + pendingVendorName.getText().trim());

		}
	}

	public void printsuspendedVendorCountAndDetails() {
		wait.until(ExpectedConditions.visibilityOfAllElements(pendingVendorCount));
		System.out.println("Total Pending Vendors Displayed: " + pendingVendorCount);
		wait.until(ExpectedConditions.visibilityOfAllElements(suspendedCount));
		for (WebElement suspendedVendorName : suspendedCount) {
			System.out.println("Pending Vendor Name: " + suspendedVendorName.getText().trim());

		}
	}

	public void printVerifiedVendorCountAndDetails() {
		wait.until(ExpectedConditions.visibilityOfAllElements(verifiedVendorCount));
		System.out.println("Total Pending Vendors Displayed: " + verifiedVendorCount);
		wait.until(ExpectedConditions.visibilityOfAllElements(verifiedCount));
		for (WebElement verifiedVendorName : verifiedCount) {
			System.out.println("Pending Vendor Name: " + verifiedVendorName.getText().trim());

		}
	}

	public void printLeadCountAndDetails() {
		wait.until(ExpectedConditions.visibilityOfAllElements(leadTable));
		System.out.println("Total Pending Vendors Displayed: " + leadTable);
		wait.until(ExpectedConditions.visibilityOfAllElements(leadTableList));
		for (WebElement leadName : leadTableList) {
			System.out.println("Lead Name: " + leadName.getText().trim());

		}
	}

	public String getVerificationCount(WebElement tab) {
		wait.until(ExpectedConditions.visibilityOf(tab));
		String text = tab.getText().trim();
		java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("\\((\\d+)\\)").matcher(text);
		if (matcher.find()) {
			return matcher.group(1);
		}
		throw new AssertionError("Count not found: " + text);

	}

	public void printDocumentVendorCountAndName() {
		wait.until(ExpectedConditions.visibilityOfAllElements(documentVendorRows));
		System.out.println("Total vendors: " + documentVendorRows.size());
		for (WebElement row : documentVendorRows) {
			System.out.println("Vendors Details: " + row.getText().trim());
		}
	}

	public void searchDocumentVendor(String vendorName) {
		wait.until(ExpectedConditions.visibilityOf(searchBarInDocumentVerication));

		searchBarInDocumentVerication.clear();
		searchBarInDocumentVerication.sendKeys(vendorName);

		wait.until(driver -> vendorNameElements.stream()
				.anyMatch(element -> element.isDisplayed() && element.getText().trim().equalsIgnoreCase(vendorName)));
	}

	public boolean selectDocumentVendor(String vendorName) {
		WebElement vendor = wait.until(driver -> vendorNameElements.stream().filter(WebElement::isDisplayed)
				.filter(element -> element.getText().trim().equalsIgnoreCase(vendorName)).findFirst().orElse(null));

		if (vendor == null) {
			return false;
		}
		wait.until(ExpectedConditions.elementToBeClickable(vendor)).click();
		wait.until(ExpectedConditions.visibilityOf(verifyTextAfterClickVendor));
		return verifyTextAfterClickVendor.isDisplayed();
	}

	public int getTotalVendorsDisplayed() {
		wait.until(driver -> !vendorNameElements.isEmpty());

		return (int) vendorNameElements.stream().filter(WebElement::isDisplayed).count();
	}

	public int getDoumentCount() {
		wait.until(ExpectedConditions.visibilityOfAllElements(overallDocument));
		return overallDocument.size();
	}

	public List<String> getDoumentName() {
		List<String> documentName = new ArrayList<>();
		for (WebElement element : overallDocument) {
			documentName.add(element.getText().trim());
		}
		return documentName;
	}

	public List<String> getBusinessName() {
		List<String> businessName = new ArrayList<>();
		for (WebElement element : storageContainerBusiness) {
			businessName.add(element.getText().trim());
		}
		return businessName;
	}

	public int getTotalBusinessDisplayed() {
		wait.until(driver -> !storageContainerBusiness.isEmpty());

		return (int) storageContainerBusiness.stream().filter(WebElement::isDisplayed).count();
	}

	public int getTotalLeadDisplayed() {
		wait.until(driver -> !leadStorageContainer.isEmpty());

		return (int) leadStorageContainer.stream().filter(WebElement::isDisplayed).count();
	}

	public int getTotalSubDisplayed() {
		wait.until(driver -> !containerSubcription.isEmpty());

		return (int) containerSubcription.stream().filter(WebElement::isDisplayed).count();
	}

	public void selectPageSize(String pageSize) {
		Select dropdown = new Select(showEntiredDropdown);
		dropdown.selectByVisibleText("Show " + pageSize);
	}

	public String getSelectedPageSize() {
		Select dropdown = new Select(showEntiredDropdown);
		return dropdown.getFirstSelectedOption().getText().trim();
	}

	public boolean areAllSummaryCardsDisplayed() {
		return wait.until(ExpectedConditions.visibilityOf(allTicketCard)).isDisplayed() && openTicketsCard.isDisplayed()
				&& inProgressTicketsCard.isDisplayed() && resolvedCard.isDisplayed() && closedTicketCards.isDisplayed();
	}

	public void printAllTicketCounts() {

		System.out.println(allTicketCard.getText());
		System.out.println(openTicketsCard.getText());
		System.out.println(inProgressTicketsCard.getText());
		System.out.println(resolvedCard.getText());
		System.out.println(closedTicketCards.getText());
	}
}
