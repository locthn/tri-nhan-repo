import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

/**
 * Step 1: Login to Shoping page
 * Step 2: Select first Item to add to cart
 */
WebUI.openBrowser('https://nguyen-tri-nhan.github.io/')
WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_user-name'))
WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_user-name'),'standard_user')
WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_password'))
WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_password'),'secret_sauce')
WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_login-button'))

WebUI.delay(2)
// * Step 2: Select first Item to add to cart
WebUI.click(findTestObject('Object Repository/inventoryPage/Backpack'))
WebUI.click(findTestObject('Object Repository/inventoryPage/button_Add to cart'))
WebUI.click(findTestObject('Object Repository/inventoryPage/products_back-image'))
WebUI.delay(2)

// * Step 3: Checkout the item 1 product
WebUI.click(findTestObject('Object Repository/inventoryPage/cart'))
WebUI.click(findTestObject('Object Repository/CheckoutPage/button_Checkout'))
WebUI.delay(2)

// * Step 4: checkout step1
WebUI.setText(findTestObject('Object Repository/checkout-step-one/input_Checkout Your Information_firstName'), 'demo') 
WebUI.setText(findTestObject('Object Repository/checkout-step-one/input_Checkout Your Information_lastName'), 'qa test')
WebUI.setText(findTestObject('Object Repository/checkout-step-one/input_Checkout Your Information_postalCode'), '9000')
WebUI.click(findTestObject('Object Repository/checkout-step-one/input_continue'))
WebUI.delay(2)
// * Step 6: checkout finish step
WebUI.click(findTestObject('Object Repository/finish checkout/button_Finish'))
WebUI.verifyElementVisible(findTestObject('Object Repository/order-success/h2_Thank you for your order'))
WebUI.delay(2)

// * Step 5: Log out to website
WebUI.click(findTestObject('Object Repository/NavSideBar/sidebar'))
WebUI.click(findTestObject('Object Repository/NavSideBar/a_Logout'))
WebUI.delay(2)
// * Result: logout success
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_user-name'))
WebUI.delay(20)

// End session
WebUI.closeBrowser()
