package org.utilities;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.geom.FlatteningPathIterator;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Actions actn;
	public static Robot rbt;
	public static Alert alrt;
	public static TakesScreenshot ss;
	public static JavascriptExecutor js;
	public static Select slct;
	public static WebDriverWait w;
	public static FluentWait<WebDriver> f;
	public static FileInputStream fis;
	public static Workbook wb;
	public static Sheet sht;
	public static Row ro;
	public static Cell cel;
	public static Date dcv;
	public static SimpleDateFormat sdf;
	public static String sheetName;

	// 1
	public static void launchChrome() {
		WebDriverManager.chromedriver().setup();
	}

	// 2
	public static void launchEdge() {
		WebDriverManager.edgedriver().setup();
	}

	// 3
	public static void launchFirefox() {
		WebDriverManager.firefoxdriver().setup();
	}

	// 4
	public static void launchOpera() {
		WebDriverManager.operadriver().setup();
	}

	// 5
	public static void chromeObject() {
		driver = new ChromeDriver();
	}

	// 6
	public static void edgeObject() {
		driver = new EdgeDriver();
	}

	// 7
	public static void firefoxObject() {
		driver = new FirefoxDriver();
	}

	// 8
	public static void operaObject() {
		driver = new OperaDriver();
	}

	// 9
	public static void winMax() {
		driver.manage().window().maximize();
	}

	// 10
	public static void launchUrl(String url) {
		driver.get(url);
	}

	// 11
	public static void getTitleAndUrl() {
		System.out.println("Title : " + driver.getTitle() + "\n" + "Current URL : " + driver.getCurrentUrl());
	}

	// 12
	public static void closeTab() {
		driver.close();
	}

	// 13
	public static void closeBrowser() {
		driver.quit();
	}

	// 14
	public static void txtBox(WebElement target, String txt) {
		target.sendKeys(txt);
	}

	// 15
	public static void moveCursorActions(WebElement target) {
		actn = new Actions(driver);
		actn.moveToElement(target).perform();
	}

	// 16
	public static void dblClickActions(WebElement target) {
		actn = new Actions(driver);
		if (target != null) {
			actn.doubleClick(target).perform();
		} else {
			actn.doubleClick().perform();
		}
	}

	// 17
	public static void rightClickActions(WebElement target) {
		actn = new Actions(driver);
		if (target != null) {
			actn.contextClick(target).perform();
		} else {
			actn.contextClick().perform();
		}
	}

	// 18
	public static void dragDropActions(WebElement source, WebElement destination) {
		actn = new Actions(driver);
		actn.dragAndDrop(source, destination).perform();
	}

	// 19
	public static void txtBoxActions(WebElement target, String txt) {
		actn = new Actions(driver);
		actn.sendKeys(target, txt).perform();
	}

	// 20
	public static void SingleClkActions(WebElement target) {
		actn = new Actions(driver);
		if (target != null) {
			actn.click(target).perform();
		} else {
			actn.click().perform();
		}
	}

	// 21
	public static void staticWait(int millisec) {
		try {
			Thread.sleep(millisec);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 22
	public static void keyprsRobot(int keyEvent) {
		try {
			rbt = new Robot();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rbt.keyPress(keyEvent);
		}
	}

	// 23
	public static void keyrlseRobot(int keyEvent) {
		try {
			rbt = new Robot();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rbt.keyRelease(keyEvent);
		}
	}

	// 24
	public static void ctrlC() {
		try {
			rbt = new Robot();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rbt.keyPress(KeyEvent.VK_CONTROL);
			rbt.keyPress(KeyEvent.VK_C);
			rbt.keyRelease(KeyEvent.VK_CONTROL);
			rbt.keyRelease(KeyEvent.VK_C);
		}
	}

	// 25
	public static void ctrlV() {
		try {
			rbt = new Robot();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rbt.keyPress(KeyEvent.VK_CONTROL);
			rbt.keyPress(KeyEvent.VK_V);
			rbt.keyRelease(KeyEvent.VK_CONTROL);
			rbt.keyRelease(KeyEvent.VK_V);
		}
	}

	// 26
	public static void ctrlA() {
		try {
			rbt = new Robot();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rbt.keyPress(KeyEvent.VK_CONTROL);
			rbt.keyPress(KeyEvent.VK_A);
			rbt.keyRelease(KeyEvent.VK_CONTROL);
			rbt.keyRelease(KeyEvent.VK_A);
		}
	}

	// 27
	public static void singleAlert() {
		alrt = driver.switchTo().alert();
		System.out.println(alrt.getText());
		alrt.accept();
	}

	// 28
	public static void conformAlert(String acceptOrNot) {
		alrt = driver.switchTo().alert();
		System.out.println(alrt.getText());
		if (acceptOrNot.equalsIgnoreCase("accept")) {
			alrt.accept();
		} else {
			alrt.dismiss();
		}
	}

	// 29
	public static void promptAlert(String acceptOrNot, String txtbox) {
		alrt = driver.switchTo().alert();
		System.out.println(alrt.getText());
		if (acceptOrNot.equalsIgnoreCase("accept")) {
			alrt.sendKeys(txtbox);
			alrt.accept();
		} else {
			alrt.dismiss();
		}
	}

	// 30
	public static void scrnshot(String snapName) {
		ss = (TakesScreenshot) driver;
		File scorce = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\shpra\\eclipse-workspace\\SampleMav\\Screenshot\\" + snapName + ".jpg");
		try {
			FileUtils.copyFile(scorce, destination);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 31
	public static void scrnshotParticlarThing(WebElement target, String snapName) {
		ss = (TakesScreenshot) driver;
		File scorce = target.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\shpra\\eclipse-workspace\\SampleMav\\Screenshot\\" + snapName + ".jpg");
		try {
			FileUtils.copyFile(scorce, destination);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 32
	public static void jsScroll(WebElement target) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", target);
	}

	// 33
	public static void jsSendkeys(String txtbox, WebElement target) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + txtbox + "')", target);
	}

	// 34
	public static void jsClick(WebElement target) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", target);
	}

	// 35
	public static void jsGetAttributevalue(String value, WebElement target) {
		js = (JavascriptExecutor) driver;
		js.executeScript("return arguments[0].getAttribute('" + value + "')", target);
	}

	// 36
	public static void jsHighlight(WebElement target) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','background:orange')", target);
	}

	// 37
	public static void jsHighlightAlignment(WebElement target) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','font-size:30px; background:orange')", target);
	}

	// 38
	public static void winHandles(int whichWindow) {
		Set<String> allWin = driver.getWindowHandles();
		List<String> allWinList = new LinkedList<String>();
		allWinList.addAll(allWin);
		for (int i = 0; i < allWinList.size(); i++) {
			if (i == (whichWindow - 1)) {
				driver.switchTo().window(allWinList.get(i));
			}
		}
	}

	// 39
	public static void gettingText(WebElement target) {
		System.out.println(target.getText());
	}

	// 40
	public static void gettingAttribute(WebElement target, String attributeName) {
		System.out.println(target.getAttribute(attributeName));
	}

	// 41
	public static void gettingTagname(WebElement target) {
		System.out.println(target.getTagName());
	}

	// 42
	public static void implicitWaiting() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	// 43
	public static void frameInId(String id) {
		driver.switchTo().frame(id);
	}

	// 44
	public static void frameInName(String name) {
		driver.switchTo().frame(name);
	}

	// 45
	public static void frameInIndex(String index) {
		driver.switchTo().frame(index);
	}

	// 46
	public static void frameInWebElement(WebElement targetFrame) {
		driver.switchTo().frame(targetFrame);
	}

	// 47
	public static void frameOutParent(String i) {
		driver.switchTo().parentFrame();
	}

	// 48
	public static void frameOutAll() {
		driver.switchTo().defaultContent();
	}

	// 49
	public static void selectingDropdownIndex(WebElement sdiTarget, int index) {
		// WebElement drpDwn = driver.findElement(By.xpath(elementXpath));
		slct = new Select(sdiTarget);
		slct.selectByIndex(index);
	}

	// 50
	public static void selectingDropdownText(WebElement sdtTarget, String visibleTxt) {
		// WebElement drpDwn = driver.findElement(By.xpath(elementXpath));
		slct = new Select(sdtTarget);
		slct.selectByVisibleText(visibleTxt);
	}

	// 51
	public static void selectingDropdownValue(WebElement sdvTarget, String value) {
		// WebElement drpDwn = driver.findElement(By.xpath(elementXpath));
		slct = new Select(sdvTarget);
		slct.selectByValue(value);
	}

	// 52
	public static void deselectingDropdownIndex(WebElement dsiTarget, int index) {
		// WebElement drpDwn = driver.findElement(By.xpath(elementXpath));
		slct = new Select(dsiTarget);
		slct.selectByIndex(index);
	}

	// 53
	public static void deselectingDropdownText(WebElement dstTarget, String visibleTxt) {
		// WebElement drpDwn = driver.findElement(By.xpath(elementXpath));
		slct = new Select(dstTarget);
		slct.selectByVisibleText(visibleTxt);
	}

	// 54
	public static void deselectingDropdownValue(WebElement dsvTarget, String value) {
		// WebElement drpDwn = driver.findElement(By.xpath(elementXpath));
		slct = new Select(dsvTarget);
		slct.selectByValue(value);
	}

	// 55
	public static void isMultiSelectDropdown(WebElement msTarget) {
		// WebElement drpDwn = driver.findElement(By.xpath(elementXpath));
		slct = new Select(msTarget);
		System.out.println(slct.isMultiple());
	}

	// 56
	public static void getOptionsInDropdown(WebElement oTarget) {
		// WebElement drpDwn = driver.findElement(By.xpath(elementXpath));
		slct = new Select(oTarget);
		List<WebElement> allOptions = slct.getOptions();
		for (int i = 0; i < allOptions.size(); i++) {
			System.out.println(allOptions.get(i).getText());
		}
	}

	// 57
	public static void getAllSelectedOptionsInDropdown(WebElement asoTarget) {
		// WebElement drpDwn = driver.findElement(By.xpath(elementXpath));
		slct = new Select(asoTarget);
		List<WebElement> allSelectedOptions = slct.getAllSelectedOptions();
		for (int i = 0; i < allSelectedOptions.size(); i++) {
			System.out.println(allSelectedOptions.get(i).getText());
		}
	}

	// 58
	public static void get1stSelectedOptionInDropdown(WebElement fsoTarget) {
		// WebElement drpDwn = driver.findElement(By.xpath(elementXpath));
		slct = new Select(fsoTarget);
		System.out.println(slct.getFirstSelectedOption().getText());
	}

	// 59
	public static void deselectAllInDropdown(WebElement daTarget) {
		// WebElement drpDwn = driver.findElement(By.xpath(elementXpath));
		slct = new Select(daTarget);
		slct.deselectAll();
	}

	// 60
	public static void webdriverWaitingForAlert() {
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.alertIsPresent());
	}

	// 61
	public static void webdriveWaitingForFrameid(String idElement) {
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id(idElement)));
	}

	// 62
	public static void webdriveWaitingForFramename(String nameElement) {
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name(nameElement)));
	}

	// 63
	public static void webdriveWaitingForFramexpath(String xpathElement) {
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(xpathElement)));
	}

	// 64
	public static void fluentWaiting() {
		f = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(2))
				.ignoring(Throwable.class);
	}

	// 65
	public static void fluentWaitingForFrameid(String idElement) {
		fluentWaiting();
		f.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id(idElement)));
	}

	// 66
	public static void fluentWaitingForFramename(String nameElement) {
		fluentWaiting();
		f.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name(nameElement)));
	}

	// 67
	public static void fluentWaitingForFramexpath(String xpathElement) {
		fluentWaiting();
		f.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(xpathElement)));
	}

	// 68
	public static void fluentWaitingForInVisibilityXpath(String xpathElement) {
		fluentWaiting();
		f.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpathElement)));
	}

	// 69
	public static void fluentWaitingForInVisibilityid(String idElement) {
		fluentWaiting();
		f.until(ExpectedConditions.invisibilityOfElementLocated(By.id(idElement)));
	}

	// 70
	public static void fluentWaitingForInVisibilityname(String nameElement) {
		fluentWaiting();
		f.until(ExpectedConditions.invisibilityOfElementLocated(By.name(nameElement)));
	}

	// 71
	public static void keyPrsAndrlseRobot(int keyEvent) {
		try {
			rbt = new Robot();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rbt.keyPress(keyEvent);
			rbt.keyRelease(keyEvent);
		}
	}

	// 72
	public static void rowLength(String fileName, int sheetIndex) {
		File f = new File("C:\\Users\\shpra\\eclipse-workspace\\SampleMav\\src\\test\\resources\\Test_Data\\" + fileName
				+ ".xlsx");
		try {
			fis = new FileInputStream(f);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				wb = new XSSFWorkbook(fis);
			} catch (Exception e1) {
				e1.printStackTrace();
			} finally {
				sheetName = wb.getSheetName(sheetIndex);
				System.out.println("sheet name : " + sheetName);
				sht = wb.getSheet(sheetName);
				System.out.println("Number of rows in " + sheetName + " = " + sht.getPhysicalNumberOfRows());
			}
		}
	}

	// 73
	public static void cellLength(String fileName, int sheetIndex, int rowIndex) {
		File f = new File("C:\\Users\\shpra\\eclipse-workspace\\SampleMav\\src\\test\\resources\\Test_Data\\" + fileName
				+ ".xlsx");
		try {
			fis = new FileInputStream(f);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				wb = new XSSFWorkbook(fis);
			} catch (Exception e1) {
				e1.printStackTrace();
			} finally {
				sheetName = wb.getSheetName(sheetIndex);
				System.out.println("sheet name : " + sheetName);
				sht = wb.getSheet(sheetName);
				ro = sht.getRow(rowIndex);
				System.out.println(
						"Number of cells in mentioned row at " + sheetName + " = " + ro.getPhysicalNumberOfCells());
			}
		}
	}

	// 74
	public static String getCellValueWithDate(String fileName, int sheetIndex, int rowIndex, int cellIndex,
			String dateFrmt) {
		File f = new File(
				"C:\\Users\\shpra\\git\\project-tool-station\\ToolStationProject\\src\\test\\resources\\Test_Data\\"
						+ fileName + ".xlsx");
		String data = "";
		try {
			fis = new FileInputStream(f);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				wb = new XSSFWorkbook(fis);
			} catch (Exception e1) {
				e1.printStackTrace();
			} finally {
				sheetName = wb.getSheetName(sheetIndex);
				// System.out.println("sheet name : " + sheetName);
				sht = wb.getSheet(sheetName);
				ro = sht.getRow(rowIndex);
				cel = ro.getCell(cellIndex);
				if (cel.getCellType() == 1) {
					data = cel.getStringCellValue();
				} else if (DateUtil.isCellDateFormatted(cel)) {
					dcv = cel.getDateCellValue();
					sdf = new SimpleDateFormat(dateFrmt);
					data = sdf.format(dcv);
				} else {
					double ncv = cel.getNumericCellValue();
					long l = (long) ncv;
					data = String.valueOf(l);
				}
			}
		}
		return data;
	}

	// 75
	public static void getCellValueWithoutDate(String fileName, int sheetIndex, int rowIndex, int cellIndex) {
		File f = new File("C:\\Users\\shpra\\eclipse-workspace\\SampleMav\\src\\test\\resources\\Test_Data\\" + fileName
				+ ".xlsx");
		try {
			fis = new FileInputStream(f);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				wb = new XSSFWorkbook(fis);
			} catch (Exception e1) {
				e1.printStackTrace();
			} finally {
				sheetName = wb.getSheetName(sheetIndex);
				System.out.println("sheet name : " + sheetName);
				sht = wb.getSheet(sheetName);
				ro = sht.getRow(rowIndex);
				cel = ro.getCell(cellIndex);
				if (cel.getCellType() == 1) {
					System.out.println(cel.getStringCellValue());
				} else {
					double ncv = cel.getNumericCellValue();
					long l = (long) ncv;
					String vOf = String.valueOf(l);
					System.out.println(vOf);
				}
			}
		}
	}

	// 76
	public static void getAllCellValues(String fileName, int sheetIndex, String dateFrmt) {
		File f = new File("C:\\Users\\shpra\\eclipse-workspace\\SampleMav\\src\\test\\resources\\Test_Data\\" + fileName
				+ ".xlsx");
		try {
			fis = new FileInputStream(f);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				wb = new XSSFWorkbook(fis);
			} catch (Exception e1) {
				e1.printStackTrace();
			} finally {
				sheetName = wb.getSheetName(sheetIndex);
				System.out.println("sheet name : " + sheetName);
				sht = wb.getSheet(sheetName);
				for (int i = 0; i < sht.getPhysicalNumberOfRows(); i++) {
					ro = sht.getRow(i);
					for (int j = 0; j < ro.getPhysicalNumberOfCells(); j++) {
						cel = ro.getCell(j);
						if (cel.getCellType() == 1) {
							System.out.println(cel.getStringCellValue());
						} else if (DateUtil.isCellDateFormatted(cel)) {
							dcv = cel.getDateCellValue();
							sdf = new SimpleDateFormat(dateFrmt);
							System.out.println(sdf.format(dcv));
						} else {
							double ncv = cel.getNumericCellValue();
							long l = (long) ncv;
							String vOf = String.valueOf(l);
							System.out.println(vOf);
						}
					}
				}

			}
		}
	}

	// 77
	public static void getNameOfSheet(String fileName, int sheetIndex) {
		File f = new File("C:\\Users\\shpra\\eclipse-workspace\\SampleMav\\src\\test\\resources\\Test_Data\\" + fileName
				+ ".xlsx");
		try {
			fis = new FileInputStream(f);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				wb = new XSSFWorkbook(fis);
			} catch (Exception e1) {
				e1.printStackTrace();
			} finally {
				sheetName = wb.getSheetName(sheetIndex);
				System.out.println("sheet name : " + sheetName);
			}
		}
	}

	// 78
	public static String getData(int sheetIndex, int rowIndex, int cellIndex) {
		String data = getCellValueWithDate("testdata", sheetIndex, rowIndex, cellIndex, "dd-MMMM-yyyy");
		return data;
	}

	// 79

}
