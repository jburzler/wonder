package er.divalite.example.components;

// Generated by the WOLips Templateengine Plug-in at java.util.GregorianCalendar[time=1211468796904,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Europe/Zurich",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=121,lastRule=java.util.SimpleTimeZone[id=Europe/Zurich,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2008,MONTH=4,WEEK_OF_YEAR=21,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=143,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=6,SECOND=36,MILLISECOND=904,ZONE_OFFSET=3600000,DST_OFFSET=3600000]

import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;
import com.webobjects.directtoweb.D2WContext;
import com.webobjects.directtoweb.D2WPage;
import com.webobjects.foundation.NSDictionary;

import er.divalite.example.Session;

public class PageWrapper extends WOComponent {
	public NSDictionary<String, String> errorMessages;
	
    public PageWrapper(WOContext aContext) {
        super(aContext);
    }
    
    public D2WContext d2wContext() {
    	if (context().page() instanceof D2WPage) {
			D2WPage d2wPage = (D2WPage) context().page();
			return d2wPage.d2wContext();
		}
    	return null;
    }
    
    // accessors

    public String stylesheet() {
    	return ((Session) session()).isWebObjectsTheme() ? "WebObjects.css" : "Neutral.css";
    }
}