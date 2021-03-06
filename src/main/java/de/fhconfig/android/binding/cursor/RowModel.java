package de.fhconfig.android.binding.cursor;

import de.fhconfig.android.binding.IObservableCollection;

/**
 * User: =ra=
 * Date: 11.10.11
 * Time: 21:05
 */
public class RowModel implements ICursorRowModel {
	protected boolean mapped = false;
	private boolean displaying = false;

	@Override
	public void onInitialize() {
	}

	@Override
	public long getId(int proposedId) {
		return proposedId;
	}

	@Override
	public final void display(IObservableCollection<?> collection, int index) {
		if (displaying) return;
		// if (!mapped) return;
		displaying = true;
		onDisplay();
	}

	@Override
	public final void hide(IObservableCollection<?> collection, int index) {
		if (!displaying) return;
		displaying = false;
		onHide();
	}

	public void onDisplay() {
	}

	public void onHide() {
	}

	@Override
	public boolean isMapped() {
		return this.mapped;
	}

	@Override
	public void setMapped(boolean mapped) {
		this.mapped = mapped;
	}
}