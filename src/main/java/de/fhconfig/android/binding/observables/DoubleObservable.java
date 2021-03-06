package de.fhconfig.android.binding.observables;

import de.fhconfig.android.binding.Observable;

public class DoubleObservable extends Observable<Double> {
	public DoubleObservable() {
		super(Double.class);
	}

	public DoubleObservable(double value) {
		super(Double.class, value);
	}
}
