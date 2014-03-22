package com.pathfinder.data.Classes.Objects;

/**
 * 
 * @author Matthew Meehan
 * A static class that is used to check if an experience 
 * value reaches the threshold needed to level up
 */
public class AdvancmentTable {
	public static LevelOption IsLeveled(int expValue, int track) {
		// Need to externalise this eventually
		LevelOption[] levelOptions = new LevelOption[] {
				new LevelOption(1, true, false),
				new LevelOption(2, false, false),
				new LevelOption(3, true, false),
				new LevelOption(4, false, true),
				new LevelOption(5, true, false),
				new LevelOption(6, false, false),
				new LevelOption(7, true, false),
				new LevelOption(8, false, true),
				new LevelOption(9, true, false),
				new LevelOption(10, false, false),
				new LevelOption(11, true, false),
				new LevelOption(12, false, true),
				new LevelOption(13, true, false),
				new LevelOption(14, false, false),
				new LevelOption(15, true, false),
				new LevelOption(16, false, true),
				new LevelOption(17, true, false),
				new LevelOption(18, false, false),
				new LevelOption(19, true, false),
				new LevelOption(20, false, true) };

		// the result of checking if they have leveled;
		LevelOption result = levelOptions[0];
		// Slow track
		if (track == 0) {
			if (expValue < 3000)
				result = levelOptions[0];
			if (expValue < 7500)
				result = levelOptions[1];
			if (expValue < 14000)
				result = levelOptions[2];
			if (expValue < 23000)
				result = levelOptions[3];
			if (expValue < 35000)
				result = levelOptions[4];
			if (expValue < 53000)
				result = levelOptions[5];
			if (expValue < 77000)
				result = levelOptions[6];
			if (expValue < 115000)
				result = levelOptions[7];
			if (expValue < 160000)
				result = levelOptions[8];
			if (expValue < 235000)
				result = levelOptions[9];
			if (expValue < 330000)
				result = levelOptions[10];
			if (expValue < 475000)
				result = levelOptions[11];
			if (expValue < 665000)
				result = levelOptions[12];
			if (expValue < 955000)
				result = levelOptions[13];
			if (expValue < 1350000)
				result = levelOptions[14];
			if (expValue < 1900000)
				result = levelOptions[15];
			if (expValue < 2700000)
				result = levelOptions[16];
			if (expValue < 3850000)
				result = levelOptions[17];
			if (expValue < 5350000)
				result = levelOptions[18];
			if (expValue >= 5350000)
				result = levelOptions[19];
		}
		// Medium Track
		else if (track == 1) {
			if (expValue < 2000)
				result = levelOptions[0];
			if (expValue < 5000)
				result = levelOptions[1];
			if (expValue < 9000)
				result = levelOptions[2];
			if (expValue < 15000)
				result = levelOptions[3];
			if (expValue < 23000)
				result = levelOptions[4];
			if (expValue < 35000)
				result = levelOptions[5];
			if (expValue < 51000)
				result = levelOptions[6];
			if (expValue < 75000)
				result = levelOptions[7];
			if (expValue < 105000)
				result = levelOptions[8];
			if (expValue < 155000)
				result = levelOptions[9];
			if (expValue < 220000)
				result = levelOptions[10];
			if (expValue < 315000)
				result = levelOptions[11];
			if (expValue < 445000)
				result = levelOptions[12];
			if (expValue < 635000)
				result = levelOptions[13];
			if (expValue < 890000)
				result = levelOptions[14];
			if (expValue < 1300000)
				result = levelOptions[15];
			if (expValue < 1800000)
				result = levelOptions[16];
			if (expValue < 2550000)
				result = levelOptions[17];
			if (expValue < 3600000)
				result = levelOptions[18];
			if (expValue >= 3600000)
				result = levelOptions[19];
		}
		// Fast Track
		else if (track == 2) {
			if (expValue < 1300)
				result = levelOptions[0];
			if (expValue < 3300)
				result = levelOptions[1];
			if (expValue < 6000)
				result = levelOptions[2];
			if (expValue < 10000)
				result = levelOptions[3];
			if (expValue < 15000)
				result = levelOptions[4];
			if (expValue < 23000)
				result = levelOptions[5];
			if (expValue < 34000)
				result = levelOptions[6];
			if (expValue < 50000)
				result = levelOptions[7];
			if (expValue < 71000)
				result = levelOptions[8];
			if (expValue < 105000)
				result = levelOptions[9];
			if (expValue < 145000)
				result = levelOptions[10];
			if (expValue < 210000)
				result = levelOptions[11];
			if (expValue < 295000)
				result = levelOptions[12];
			if (expValue < 425000)
				result = levelOptions[13];
			if (expValue < 600000)
				result = levelOptions[14];
			if (expValue < 850000)
				result = levelOptions[15];
			if (expValue < 1200000)
				result = levelOptions[16];
			if (expValue < 1700000)
				result = levelOptions[17];
			if (expValue < 2400000)
				result = levelOptions[18];
			if (expValue >= 2400000)
				result = levelOptions[19];
		}

		return result;
	}
}
