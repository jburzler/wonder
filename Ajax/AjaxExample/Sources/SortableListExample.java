// Generated by the WOLips Templateengine Plug-in at Apr 22, 2006 10:13:01 PM

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableArray;

public class SortableListExample extends WOComponent {
  private NSMutableArray _listA;
  private NSArray _listB;
  public ListItem _repetitionListItemA;
  public ListItem _repetitionListItemB;

  public SortableListExample(WOContext context) {
    super(context);
    NSMutableArray listA = new NSMutableArray();
    for (int i = 0; i < 10; i++) {
      listA.addObject(new ListItem(String.valueOf(i) + "A", "A Element #" + i));
    }
    _listA = listA;

    NSMutableArray listB = new NSMutableArray();
    for (int i = 0; i < 10; i++) {
      listB.addObject(new ListItem(String.valueOf(i) + "B", "B Element #" + i));
    }
    _listB = listB.immutableClone();
  }

  public NSMutableArray listA() {
    return _listA;
  }
  
  public NSArray listB() {
    return _listB;
  }
  
  public void setListB(NSArray listB) {
    _listB = listB;
  }
  
  public WOActionResults orderChanged() {
    System.out.println("SortableListExample.orderChanged: A: " + _listA);
    System.out.println("SortableListExample.orderChanged: B: " + _listB);
    return null;
  }

  protected static class ListItem {
    private String _id;
    private String _name;

    public ListItem(String id, String name) {
      _id = id;
      _name = name;
    }

    public String name() {
      return _name;
    }

    public String id() {
      return _id;
    }

    public String toString() {
      return "[ListItem: id = " + _id + "]";
    }
  }
}