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

WebUI.callTestCase(findTestCase('ZCobaKatalon/Shipper/1-Big Fleet/b-Subscription/Tampilan Awal Subscription'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ZCoba Katalon/Shipper/Tambah Langganan/buttonBerlanggananSekarang'))

WebUI.click(findTestObject('ZCoba Katalon/Shipper/Tambah Langganan/buttonRadio3Bulan'))

WebUI.click(findTestObject('ZCoba Katalon/Shipper/Tambah Langganan/buttonPilihMetodePembayaran'))

WebUI.click(findTestObject('ZCoba Katalon/Shipper/Tambah Langganan/buttonKartuKredit'))

WebUI.setText(findTestObject('ZCoba Katalon/Shipper/Tambah Langganan/fieldNomorKartu'), '1234567891234567')

WebUI.setText(findTestObject('ZCoba Katalon/Shipper/Tambah Langganan/fieldBulanKartu'), '02')

WebUI.setText(findTestObject('ZCoba Katalon/Shipper/Tambah Langganan/fieldTahunKartu'), '68')

WebUI.setText(findTestObject('ZCoba Katalon/Shipper/Tambah Langganan/fieldCVVKartu'), '336')

WebUI.click(findTestObject('ZCoba Katalon/Shipper/Tambah Langganan/dropdownPilihPembayaran'))

WebUI.click(findTestObject('ZCoba Katalon/Shipper/Tambah Langganan/dropdownPilihPembayaranPenuh'))

WebUI.click(findTestObject('ZCoba Katalon/Shipper/Tambah Langganan/buttonBayarSekarang'))

WebUI.click(findTestObject('ZCoba Katalon/Shipper/Tambah Langganan/buttonBuatPesanan'))

WebUI.click(findTestObject('ZCoba Katalon/Shipper/Tambah Langganan/checkboxSnK1'))

WebUI.click(findTestObject('ZCoba Katalon/Shipper/Tambah Langganan/checkboxSnK2'))

WebUI.click(findTestObject('ZCoba Katalon/Shipper/Tambah Langganan/checkboxSnK3'))

WebUI.click(findTestObject('ZCoba Katalon/Shipper/Tambah Langganan/checkboxSnK4'))

WebUI.click(findTestObject('ZCoba Katalon/Shipper/Tambah Langganan/buttonLanjutkanSnK'))

