//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment2
//Matrik: #240359
//Name: #Goay Kai Ling
package assignment2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class assignment2 {

    private static final String EXCEL_FILE_LOCATION = "assignment2.xls";
    static final String FOLDERNAME = "test_files";
    static final String[] header = new String[4];
    static final String[] matricNo = new String[2];
    static final int[] content1 = new int[12];
    static final int[] content0 = new int[12];
    static int loc1, blank1, comment1, packageC1, classC1, extendsC1, publicC1, voidC1, staticC1, newC1, totalJavaKeywords1, actualLOC1, total1;
    static int loc0, blank0, comment0, packageC0, classC0, extendsC0, publicC0, voidC0, staticC0, newC0, totalJavaKeywords0, actualLOC0, total0;

    static final String[] javaKeywords
            = {"null", "true", "false", "abstract", "continue", "for", "new", "switch",
                "assert", "default", "goto", "package", "synchronized", "boolean", "do", "if",
                "private", "this", "break", "double", "implements", "protected", "throw", "byte",
                "else", "import", "public", "throws", "case", "enum", "instanceof", "return",
                "transient", "catch", "extends", "int", "short", "try", "char", "final",
                "interface", "static", "void", "class", "finally", "long", "strictfp", "volatile",
                "const", "float", "native", "super", "while"};

    public static void main(String[] args) throws IOException, WriteException {
        assignment2 a2 = new assignment2();
        a2.result();
    }

    public void result() throws IOException {
        assignment2 a2 = new assignment2();
        a2.readJavaFiles();

        //MyThread2.java
        totalJavaKeywords1 = packageC1 + classC1 + extendsC1 + publicC1 + voidC1 + staticC1 + newC1;
        actualLOC1 = loc1 - blank1 - comment1;
        total1 = actualLOC1 + totalJavaKeywords1;
        content1[0] = loc1;
        content1[1] = blank1;
        content1[2] = comment1;
        content1[3] = actualLOC1;
        content1[4] = packageC1;
        content1[5] = classC1;
        content1[6] = extendsC1;
        content1[7] = publicC1;
        content1[8] = voidC1;
        content1[9] = staticC1;
        content1[10] = newC1;
        content1[11] = total1;

        //MyThread1.java
        totalJavaKeywords0 = packageC0 + classC0 + extendsC0 + publicC0 + voidC0 + staticC0 + newC0;
        actualLOC0 = loc0 - blank0 - comment0;
        total0 = actualLOC0 + totalJavaKeywords0;
        content0[0] = loc0;
        content0[1] = blank0;
        content0[2] = comment0;
        content0[3] = actualLOC0;
        content0[4] = packageC0;
        content0[5] = classC0;
        content0[6] = extendsC0;
        content0[7] = publicC0;
        content0[8] = voidC0;
        content0[9] = staticC0;
        content0[10] = newC0;
        content0[11] = total0;

        //1. Create an Excel file
        WritableWorkbook myFirstWbook = null;
        try {

            myFirstWbook = Workbook.createWorkbook(new File(EXCEL_FILE_LOCATION));

            // create an Excel sheet
            WritableSheet excelSheet = myFirstWbook.createSheet("Assignment 2 Output", 0);

            // add something into the Excel sheet
            Label label = new Label(0, 0, "Semester");
            excelSheet.addCell(label);

            label = new Label(0, 1, "Course");
            excelSheet.addCell(label);

            label = new Label(0, 2, "Group");
            excelSheet.addCell(label);

            label = new Label(0, 3, "Task");
            excelSheet.addCell(label);

            label = new Label(5, 5, "java keyword");
            excelSheet.addCell(label);

            label = new Label(0, 6, "Matrik");
            excelSheet.addCell(label);

            label = new Label(1, 6, "LOC");
            excelSheet.addCell(label);

            label = new Label(2, 6, "Blank");
            excelSheet.addCell(label);

            label = new Label(3, 6, "Comment");
            excelSheet.addCell(label);

            label = new Label(4, 6, "ActualLOC");
            excelSheet.addCell(label);

            label = new Label(5, 6, "package");
            excelSheet.addCell(label);

            label = new Label(6, 6, "class");
            excelSheet.addCell(label);

            label = new Label(7, 6, "extends");
            excelSheet.addCell(label);

            label = new Label(8, 6, "public");
            excelSheet.addCell(label);

            label = new Label(9, 6, "void");
            excelSheet.addCell(label);

            label = new Label(10, 6, "static");
            excelSheet.addCell(label);

            label = new Label(11, 6, "new");
            excelSheet.addCell(label);

            label = new Label(12, 6, "total");
            excelSheet.addCell(label);

            //Details of header
            label = new Label(1, 0, header[0]);
            excelSheet.addCell(label);
            label = new Label(1, 1, header[1]);
            excelSheet.addCell(label);
            label = new Label(1, 2, header[2]);
            excelSheet.addCell(label);
            label = new Label(1, 3, header[3]);
            excelSheet.addCell(label);

            //Details of MyThread2.java
            label = new Label(0, 7, matricNo[0]);
            excelSheet.addCell(label);

            jxl.write.Number number = new jxl.write.Number(1, 7, content1[0]);
            excelSheet.addCell(number);
            number = new jxl.write.Number(2, 7, content1[1]);
            excelSheet.addCell(number);
            number = new jxl.write.Number(3, 7, content1[2]);
            excelSheet.addCell(number);
            number = new jxl.write.Number(4, 7, content1[3]);
            excelSheet.addCell(number);
            number = new jxl.write.Number(5, 7, content1[4]);
            excelSheet.addCell(number);
            number = new jxl.write.Number(6, 7, content1[5]);
            excelSheet.addCell(number);
            number = new jxl.write.Number(7, 7, content1[6]);
            excelSheet.addCell(number);
            number = new jxl.write.Number(8, 7, content1[7]);
            excelSheet.addCell(number);
            number = new jxl.write.Number(9, 7, content1[8]);
            excelSheet.addCell(number);
            number = new jxl.write.Number(10, 7, content1[9]);
            excelSheet.addCell(number);
            number = new jxl.write.Number(11, 7, content1[10]);
            excelSheet.addCell(number);
            number = new jxl.write.Number(12, 7, content1[11]);
            excelSheet.addCell(number);

            //Details of MyThread1.java
            label = new Label(0, 8, matricNo[1]);
            excelSheet.addCell(label);
            number = new jxl.write.Number(1, 8, content0[0]);
            excelSheet.addCell(number);
            number = new jxl.write.Number(2, 8, content0[1]);
            excelSheet.addCell(number);
            number = new jxl.write.Number(3, 8, content0[2]);
            excelSheet.addCell(number);
            number = new jxl.write.Number(4, 8, content0[3]);
            excelSheet.addCell(number);
            number = new jxl.write.Number(5, 8, content0[4]);
            excelSheet.addCell(number);
            number = new jxl.write.Number(6, 8, content0[5]);
            excelSheet.addCell(number);
            number = new jxl.write.Number(7, 8, content0[6]);
            excelSheet.addCell(number);
            number = new jxl.write.Number(8, 8, content0[7]);
            excelSheet.addCell(number);
            number = new jxl.write.Number(9, 8, content0[8]);
            excelSheet.addCell(number);
            number = new jxl.write.Number(10, 8, content0[9]);
            excelSheet.addCell(number);
            number = new jxl.write.Number(11, 8, content0[10]);
            excelSheet.addCell(number);
            number = new jxl.write.Number(12, 8, content0[11]);
            excelSheet.addCell(number);
            myFirstWbook.write();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (WriteException e) {
            e.printStackTrace();
        } finally {

            if (myFirstWbook != null) {
                try {
                    myFirstWbook.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (WriteException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    public void readJavaFiles() throws IOException {
        File f = new File(FOLDERNAME);
        File[] fileNo = f.listFiles();
        if (fileNo != null) {
            for (File fileNo1 : fileNo) {
                if (fileNo1.getName().endsWith(".java")) {
                    //System.out.println(fileNo[i]);
                }
            }
        } else {
            System.out.println("Invalid directory");
        }

        //read MyThread2.java
         try (BufferedReader b = new BufferedReader(new FileReader(f.getAbsolutePath()+File.separator+ fileNo[1].getName()))) {
            String file1;
            while ((file1 = b.readLine()) != null) {
                if (file1.contains("//Semester: #")) {
                    header[0] = file1.split("#")[1];
                    //System.out.println(header[0]);
                } else if (file1.contains("//Course: #")) {
                    header[1] = file1.split("#")[1];
                    //System.out.println(header[1]);
                } else if (file1.contains("//Group: #")) {
                    header[2] = file1.split("#")[1];
                    //System.out.println(header[2]);
                } else if (file1.contains("//Task: #")) {
                    header[3] = file1.split("#")[1];
                    //System.out.println(header[3]);
                } else if (file1.contains("//Matrik: #")) {
                    matricNo[0] = file1.split("#")[1];
                    //System.out.println(matricNo[0]);
                }

                if (file1.contains("")) {
                    loc1++;
                }

                if (file1.trim().isEmpty()) {
                    blank1++;
                }
                if (file1.contains("//")) {
                    comment1++;
                }

                for (String javaKeyword : javaKeywords) {
                    if (file1.contains(javaKeyword) && javaKeyword.contains("package")) {
                        packageC1++;
                    } else if (file1.contains(javaKeyword) && javaKeyword.contains("class")) {
                        classC1++;
                    } else if (file1.contains(javaKeyword) && javaKeyword.contains("extends")) {
                        extendsC1++;
                    } else if (file1.contains(javaKeyword) && javaKeyword.contains("public")) {
                        publicC1++;
                    } else if (file1.contains(javaKeyword) && javaKeyword.contains("void")) {
                        voidC1++;
                    } else if (file1.contains(javaKeyword) && javaKeyword.contains("static")) {
                        staticC1++;
                    } else if (file1.contains(javaKeyword) && javaKeyword.contains("new")) {
                        newC1++;
                    }
                }
            }
        } catch (IOException e) {
        }

        //read MyThread1.java
         try (BufferedReader b = new BufferedReader(new FileReader(f.getAbsolutePath()+File.separator+ fileNo[0].getName()))) {
            String file0;
            while ((file0 = b.readLine()) != null) {
                if (file0.contains("//Matrik: #")) {
                    matricNo[1] = file0.split("#")[1];
                    //System.out.println(matricNo[1]);
                }
                if (file0.contains("")) {
                    loc0++;
                }

                if (file0.trim().isEmpty()) {
                    blank0++;
                }
                if (file0.contains("//")) {
                    comment0++;
                }

                for (String javaKeyword : javaKeywords) {
                    if (file0.contains(javaKeyword) && javaKeyword.contains("package")) {
                        packageC0++;
                    } else if (file0.contains(javaKeyword) && javaKeyword.contains("class")) {
                        classC0++;
                    } else if (file0.contains(javaKeyword) && javaKeyword.contains("extends")) {
                        extendsC0++;
                    } else if (file0.contains(javaKeyword) && javaKeyword.contains("public")) {
                        publicC0++;
                    } else if (file0.contains(javaKeyword) && javaKeyword.contains("void")) {
                        voidC0++;
                    } else if (file0.contains(javaKeyword) && javaKeyword.contains("static")) {
                        staticC0++;
                    } else if (file0.contains(javaKeyword) && javaKeyword.contains("new")) {
                        newC0++;
                    }
                }
            }
        } catch (IOException e) {
        }
    }

}
