import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

/**
 * Step 1: Login to Shoping page
 * Step 2: Select first Item to add to cart
 */
WebUI.openBrowser('https://nguyen-tri-nhan.github.io/')
WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_user-name'))
WebUI.sendKeys(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_user-name'),'standard_user')
WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_password'))
WebUI.sendKeys(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_password'),'secret_sauce')
WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_login-button'))


// * Step 2: Select first Item to add to cart
WebUI.click(findTestObject('Object Repository/inventoryPage/Backpack'))
WebUI.click(findTestObject('Object Repository/inventoryPage/button_Add to cart'))
WebUI.click(findTestObject('Object Repository/inventoryPage/products_back-image'))


// * Step 3: Checkout the item 1 product
WebUI.click(findTestObject('Object Repository/inventoryPage/cart'))
WebUI.click(findTestObject('Object Repository/CheckoutPage/button_Checkout'))

// * Step 4: checkout step1
WebUI.sendKeys(findTestObject('Object Repository/checkout-step-one/input_Checkout Your Information_firstName'), 'demo') 
WebUI.sendKeys(findTestObject('Object Repository/checkout-step-one/input_Checkout Your Information_lastName'), 'qa test')
WebUI.sendKeys(findTestObject('Object Repository/checkout-step-one/input_Checkout Your Information_postalCode'), '9000')
WebUI.click(findTestObject('Object Repository/checkout-step-one/input_continue'))

// * Step 6: checkout finish step
WebUI.click(findTestObject('Object Repository/finish checkout/button_Finish'))
WebUI.verifyElementVisible(findTestObject('Object Repository/order-success/h2_Thank you for your order'))
// * Step 5: Log out to website
WebUI.click(findTestObject('Object Repository/NavSideBar/sidebar'))
WebUI.click(findTestObject('Object Repository/NavSideBar/a_Logout'))

// * Result: logout success
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_user-name'))
WebUI.closeBrowser()


