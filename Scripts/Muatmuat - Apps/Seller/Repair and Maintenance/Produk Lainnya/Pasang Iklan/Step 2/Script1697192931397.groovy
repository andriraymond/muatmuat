import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.setText(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/android.widget.EditText - Masukkan Judul'), GlobalVariable.Caption, 60)

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/Button Masukkan Foto'), 0)

Mobile.callTestCase(findTestCase('Test Cases/Muatmuat - Apps/Seller/Global/Pasang Iklan/Step 2/Upload Photo'), [:])

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/ScrollView'), 0)

Mobile.swipe(0, 1400, 0, 800)

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/Button Masukkan Caption'), 0)

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/Upload Photo/Button Gallery'), 0)

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/android.widget.TextView - ' + GlobalVariable.VideoFilename), 0)

Mobile.setText(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/android.widget.EditText - Masukan Harga'), GlobalVariable.Price, 60)

Mobile.setText(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/android.widget.EditText - Masukkan Deskripsi'), GlobalVariable.Caption, 60)

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/Dropdown Lokasi Iklan'), 0)

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/ListItem Lokasi Iklan (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/Button Unggah Iklan'), 0)

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Button Pasang Iklan Baru'), 0)