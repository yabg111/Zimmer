package DataModel.entities;

import BusinessLogical.ApplicationApi.models.HR.HRModule;
import BusinessLogical.ApplicationApi.models.purcase.PurcaseModule;
import BusinessLogical.ApplicationApi.models.reports.ReportsModule;
import BusinessLogical.ApplicationApi.models.salesModule.SalesModule;
import User.User;

/**
 * @author מנהל צימר
 * @since 10/04/18
 * @page 19 {@code: 1.4.2}
 */
public class DirectorE1 extends User {
	private HRModule hrModule;
	private PurcaseModule purcaseModule;
	private ReportsModule reportsModule;
	private SalesModule salesModule;
}
