package org.utilities;

import org.testng.annotations.DataProvider;
import org.utilities.BaseClass;

public class dataProviderr extends BaseClass {

	@DataProvider(name = "signInData")
	private Object[][] signInData() {
		return new Object[][] { { getData(1, 1, 0), getData(1, 1, 1) }, { getData(1, 2, 0), getData(1, 2, 1) },
				{ getData(1, 3, 0), getData(1, 3, 1) }, { getData(1, 4, 0), getData(1, 4, 1) },
				{ getData(1, 5, 0), getData(1, 5, 1) }, { getData(1, 6, 0), getData(1, 6, 1) },
				{ getData(1, 7, 0), getData(1, 7, 1) }, { getData(1, 8, 0), getData(1, 8, 1) },
				{ getData(1, 9, 0), getData(1, 9, 1) }, { getData(1, 10, 0), getData(1, 10, 1) },
				{ getData(1, 11, 0), getData(1, 11, 1) } };
	}

	@DataProvider(name = "searchByItems")
	private Object[][] searchDataByItems() {
		return new Object[][] { { getData(0, 1, 0) }, { getData(0, 2, 0) }, { getData(0, 3, 0) },
				{ getData(0, 4, 0) } /*
										 * ,{ getData(0, 5, 0) }, { getData(0, 6, 0) }, { getData(0, 7, 0) }, {
										 * getData(0, 8, 0) }, { getData(0, 9, 0) }, { getData(0, 10, 0) }, { getData(0,
										 * 11, 0) }, { getData(0, 12, 0) }, { getData(0, 13, 0) }, { getData(0, 14, 0)
										 * }, { getData(0, 15, 0) }, { getData(0, 16, 0) }, { getData(0, 17, 0) }, {
										 * getData(0, 18, 0) }, { getData(0, 19, 0) }, { getData(0, 20, 0) }, {
										 * getData(0, 21, 0) }
										 */

		};
	}

	@DataProvider(name = "searchByBrands")
	private Object[][] searchDataByBrands() {
		return new Object[][] { { getData(0, 1, 0) }, { getData(0, 2, 0) }, { getData(0, 3, 0) },
				{ getData(0, 4, 0) }/*
									 * ,{ getData(0, 5, 0) }, { getData(0, 6, 0) }, { getData(0, 7, 0) }, {
									 * getData(0, 8, 0) }, { getData(0, 9, 0) }, { getData(0, 10, 0) }, { getData(0,
									 * 11, 0) }, { getData(0, 12, 0) }, { getData(0, 13, 0) }, { getData(0, 14, 0)
									 * }, { getData(0, 15, 0) }, { getData(0, 16, 0) }, { getData(0, 17, 0) }, {
									 * getData(0, 18, 0) }, { getData(0, 19, 0) }, { getData(0, 20, 0) }, {
									 * getData(0, 21, 0) }
									 */

		};
	}

	@DataProvider(name = "url")
	private Object[][] url() {
		return new Object[][] { { getData(3, 5, 1) } };
	}

}
