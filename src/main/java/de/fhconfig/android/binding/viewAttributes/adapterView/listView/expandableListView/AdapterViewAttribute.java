package de.fhconfig.android.binding.viewAttributes.adapterView.listView.expandableListView;

import de.fhconfig.android.binding.ViewAttribute;
import de.fhconfig.android.binding.collections.LazyLoadAdapter;
import android.widget.AbsListView;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

/**
 * To Provide adapter to ExpandableListView
 * 
 * @name adapter
 * @widget ExpandableListView
 * @type ExpandableListAdapter
 * @accepts	ExpandableListAdapter
 * @category expandable-list 
 * @related 
 * 
 * @author andy
 *
 * @param <T>
 */
public class AdapterViewAttribute extends ViewAttribute<ExpandableListView, ExpandableListAdapter> {
	public AdapterViewAttribute(ExpandableListView view) {
		super(ExpandableListAdapter.class, view, "adapter");
	}

	@Override
	protected void doSetAttributeValue(Object newValue) {
		if(getView()==null) return;
		if (newValue instanceof ExpandableListAdapter){
			getView().setAdapter((ExpandableListAdapter)newValue);
			if (newValue instanceof LazyLoadAdapter){
				if (getView() instanceof AbsListView)
				((LazyLoadAdapter)newValue).setRoot((AbsListView)getView());
			}
		}
	}

	@Override
	public ExpandableListAdapter get() {
		if(getView()==null) return null;
		return (ExpandableListAdapter)getView().getAdapter();
	}
}