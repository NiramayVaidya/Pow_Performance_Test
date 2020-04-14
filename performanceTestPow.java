import java.lang.*;

class Power {
	int testArray1[] = new int[100];
	int testArray2[] = new int[100];
	double testArray3[] = new double[100];
	double testArray4[] = new double[100];
	int i, j, value1;
	double value2;
	static long time1, time2;
	static long time[] = new long[12];
	static int k;
	void inputInArray() {
		for(i = 0; i < 100; i++) {
			testArray1[i] = 99 * (i + 1);
			testArray2[i] = (-99) * (i + 1);
			testArray3[i] = (99.5) * (i + 1);
			testArray4[i] = (-99.5) * (i + 1);
		}
	}
	void directMult1() {
		for(i = 0; i < 100; i++) {
			value1 = testArray1[i] * testArray1[i];
		}
	}
        void directMult2() {
                for(i = 0; i < 100; i++) {
                        value1 = testArray2[i] * testArray2[i];
                }
        }
        void directMult3() {
                for(i = 0; i < 100; i++) {
                        value2 = testArray3[i] * testArray3[i];
                }
        }
        void directMult4() {
                for(i = 0; i < 100; i++) {
                        value2 = testArray4[i] * testArray4[i];
                }
        }	
	void iterMult1() {
		for(i = 0; i < 100; i++) {
			value1 = 1;
			for(j = 0; j < 2; j++) {
				value1 = value1 * testArray1[i];
			}
		}
	}
        void iterMult2() {
                for(i = 0; i < 100; i++) {
                        value1 = 1;
                        for(j = 0; j < 2; j++) {
                                value1 = value1 * testArray2[i];
                        }
                }
	}
        void iterMult3() {
                for(i = 0; i < 100; i++) {
                        value2 = 1;
                        for(j = 0; j < 2; j++) {
                                value2 = value2 * testArray3[i];
                        }
                }
	}
        void iterMult4() {
                for(i = 0; i < 100; i++) {
                        value2 = 1;
                        for(j = 0; j < 2; j++) {
                                value2 = value2 * testArray4[i];
                        }
                }
	} 		
	void mathPow1() {
		for(i = 0; i < 100; i++) {
			value1 = (int)Math.pow(testArray1[i], 2);
		}
	}
        void mathPow2() {
                for(i = 0; i < 100; i++) {
                        value1 = (int)Math.pow(testArray2[i], 2);
                }
	}
        void mathPow3() {
                for(i = 0; i < 100; i++) {
                        value2 = Math.pow(testArray3[i], 2);
                }
	}
        void mathPow4() {
                for(i = 0; i < 100; i++) {
                        value2 = Math.pow(testArray4[i], 2);
                }
	}
	public static void main(String args[]) {
		Power power = new Power();
		power.inputInArray();
		for(k = 0; k < 12; k++) {
			switch(k + 1) {
				case 1:
					time1 = System.nanoTime();
					power.directMult1();
					time2 = System.nanoTime();	
					time[k] = time2 - time1;
					break;
                                case 2:
                                        time1 = System.nanoTime();
                                        power.directMult2();
                                        time2 = System.nanoTime();
                                        time[k] = time2 - time1;
                                        break;
                                case 3:
                                        time1 = System.nanoTime();
                                        power.directMult3();
                                        time2 = System.nanoTime();
                                        time[k] = time2 - time1;
                                        break;
                                case 4:
                                        time1 = System.nanoTime();
                                        power.directMult4();
                                        time2 = System.nanoTime();
                                        time[k] = time2 - time1;
                                        break;
                                case 5:
                                        time1 = System.nanoTime();
                                        power.iterMult1();
                                        time2 = System.nanoTime();
                                        time[k] = time2 - time1;
                                        break;
                                case 6:
                                        time1 = System.nanoTime();
                                        power.iterMult2();
                                        time2 = System.nanoTime();
                                        time[k] = time2 - time1;
                                        break;
                                case 7:
                                        time1 = System.nanoTime();
                                        power.directMult3();
                                        time2 = System.nanoTime();
                                        time[k] = time2 - time1;
                                        break;
                                case 8:
                                        time1 = System.nanoTime();
                                        power.iterMult4();
                                        time2 = System.nanoTime();
                                        time[k] = time2 - time1;
                                        break;
                                case 9:
                                        time1 = System.nanoTime();
                                        power.mathPow1();
                                        time2 = System.nanoTime();
                                        time[k] = time2 - time1;
                                        break;
                                case 10:
                                        time1 = System.nanoTime();
                                        power.mathPow2();
                                        time2 = System.nanoTime();
                                        time[k] = time2 - time1;
                                        break;
                                case 11:
                                        time1 = System.nanoTime();
                                        power.mathPow3();
                                        time2 = System.nanoTime();
                                        time[k] = time2 - time1;
                                        break;
                                case 12:
                                        time1 = System.nanoTime();
                                        power.mathPow4();
                                        time2 = System.nanoTime();
                                        time[k] = time2 - time1;
                                        break;
				default:
					break;
			}
		}
		System.out.println("Approach" + "\tcase1" + "\tcase2" + "\tcase3" + "\tcase4");
		System.out.println("----------------------------------------------");
                System.out.println("----------------------------------------------");
		System.out.println("directMult" + "\t" + time[0] + "\t" + time[1] + "\t" + time[2] + "\t" + time[3]);
                System.out.println("iterMult" + "\t" + time[4] + "\t" + time[5] + "\t" + time[6] + "\t" + time[7]);
                System.out.println("mathPow\t" + "\t" + time[8] + "\t" + time[9] + "\t" + time[10] + "\t" + time[11]);
	}
};
		
