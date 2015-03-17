class Util {
    // This works in both gradle and eclipse.   Very nice!
    File stringToClassPathFile(String fileName) {
		new File(getClass().getClassLoader().getResource(fileName).getFile());
    }
}