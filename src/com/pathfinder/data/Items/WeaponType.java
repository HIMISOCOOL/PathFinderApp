package com.pathfinder.data.Items;

public enum WeaponType {
	Simple(true, true, true, true, true, true), Martial(false, true, true,
			true, true, true), Exotic(false, true, true, true, true, true);

	public final boolean Unarmed;
	public final boolean Light;
	public final boolean OneHanded;
	public final boolean TwoHanded;
	public final boolean Ranged;
	public final boolean Ammunition;

	/**
	 * @param unarmed
	 * @param light
	 * @param oneHanded
	 * @param twoHanded
	 * @param ranged
	 * @param ammunition
	 */
	private WeaponType(boolean unarmed, boolean light, boolean oneHanded,
			boolean twoHanded, boolean ranged, boolean ammunition) {
		Unarmed = unarmed;
		Light = light;
		OneHanded = oneHanded;
		TwoHanded = twoHanded;
		Ranged = ranged;
		Ammunition = ammunition;
	}
}
