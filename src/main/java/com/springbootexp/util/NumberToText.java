package com.springbootexp.util;

 import java.math.BigDecimal;




public class NumberToText {
    String text;
    private static final String[] st1 = new String[]{"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] st2 = new String[]{"Hundred", "Thousand", "Lakh", "Crore"};
    private static final String[] st3 = new String[]{"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] st4 = new String[]{"Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

   private static com.ibm.icu.text.DecimalFormat decimalFormat = new com.ibm.icu.text.DecimalFormat("#####0.00");
    public NumberToText() {
    }

    private String convertA(int number) {
        int n = 1;

        for(this.text = ""; number != 0; ++n) {
            int word;
            switch(n) {
                case 1:
                    word = number % 100;
                    this.pass(word);
                    number /= 100;
                    break;
                case 2:
                    word = number % 10;
                    if (word != 0) {
                        this.show(" ");
                        this.show(st2[0]);
                        this.show(" ");
                        this.pass(word);
                    }

                    number /= 10;
                    break;
                case 3:
                    word = number % 100;
                    if (word != 0) {
                        this.show(" ");
                        this.show(st2[1]);
                        this.show(" ");
                        this.pass(word);
                    }

                    number /= 100;
                    break;
                case 4:
                    word = number % 100;
                    if (word != 0) {
                        this.show(" ");
                        this.show(st2[2]);
                        this.show(" ");
                        this.pass(word);
                    }

                    number /= 100;
                    break;
                case 5:
                    word = number % 100;
                    if (word != 0) {
                        this.show(" ");
                        this.show(st2[3]);
                        this.show(" ");
                        this.pass(word);
                    }

                    number /= 100;
            }
        }

        return this.text;
    }

    private void pass(int number) {
        if (number < 10) {
            this.show(st1[number]);
        }

        if (number > 9 && number < 20) {
            this.show(st3[number - 10]);
        }

        if (number > 19) {
            int word = number % 10;
            int q;
            if (word == 0) {
                q = number / 10;
                this.show(st4[q - 2]);
            } else {
                q = number / 10;
                this.show(st1[word]);
                this.show(" ");
                this.show(st4[q - 2]);
            }
        }

    }

    public void show(String s) {
        String st = this.text;
        this.text = s;
        this.text = this.text + st;
    }

    public static String convert(String number) {
        BigDecimal bd = (new BigDecimal(number)).abs().setScale(2, 4);
        int dollars = (int)Math.floor((double)bd.intValue());
        StringBuilder inText = new StringBuilder(new NumberToText().convertA(dollars));
        int decimalIndex = number.lastIndexOf(".");
        if (decimalIndex >= 0) {
            String nums = bd.toString();
            int cent = Integer.parseInt(nums.substring(nums.lastIndexOf(".") + 1));
            if (cent > 0) {
                inText.append(" and ").append(new NumberToText().convertA(cent));
            }
        }

        return inText.toString();
    }

    public static String convert(BigDecimal number) {
        BigDecimal bd = number.abs().setScale(2, 4);
        int dollars = (int)Math.floor((double)bd.intValue());
        StringBuilder inText = new StringBuilder(new NumberToText().convertA(dollars));
        int decimalIndex = number.toString().lastIndexOf(".");
        if (decimalIndex >= 0) {
            String nums = bd.toString();
            int cent = Integer.parseInt(nums.substring(nums.lastIndexOf(".") + 1));
            if (cent > 0) {
                inText.append(" and ").append(new NumberToText().convertA(cent));
            }
        }

        return inText.toString();
    }

    public static String convertUpper(String number) {
        BigDecimal bd = (new BigDecimal(number)).abs().setScale(2, 4);
        int dollars = (int)Math.floor((double)bd.intValue());
        StringBuilder inText = new StringBuilder(new NumberToText().convertA(dollars));
        int decimalIndex = number.lastIndexOf(".");
        if (decimalIndex >= 0) {
            String nums = bd.toString();
            int cent = Integer.parseInt(nums.substring(nums.lastIndexOf(".") + 1));
            if (cent > 0) {
                inText.append(" and ").append(new NumberToText().convertA(cent));
            }
        }

        return inText.toString().toUpperCase();
    }

    public static String convertUpper(BigDecimal number) {
        BigDecimal bd = number.abs().setScale(2, 4);
        int dollars = (int)Math.floor((double)bd.intValue());
        StringBuilder inText = new StringBuilder(new NumberToText().convertA(dollars));
        int decimalIndex = number.toString().lastIndexOf(".");
        if (decimalIndex >= 0) {
            String nums = bd.toString();
            int cent = Integer.parseInt(nums.substring(nums.lastIndexOf(".") + 1));
            if (cent > 0) {
                inText.append(" and ").append(new NumberToText().convertA(cent));
            }
        }

        return inText.toString().toUpperCase();
    }

    public static String convertUpperFirst(String number) {
        BigDecimal bd = (new BigDecimal(number)).abs().setScale(2, 4);
        int dollars = (int)Math.floor((double)bd.intValue());
        StringBuilder inText = new StringBuilder(new NumberToText().convertA(dollars));
        int decimalIndex = number.lastIndexOf(".");
        if (decimalIndex >= 0) {
            String nums = bd.toString();
            int cent = Integer.parseInt(nums.substring(nums.lastIndexOf(".") + 1));
            if (cent > 0) {
                inText.append(" and ").append(new NumberToText().convertA(cent));
            }
        }

        char[] stringArray = inText.toString().toLowerCase().toCharArray();
        stringArray[0] = Character.toUpperCase(stringArray[0]);
        return new String(stringArray);
    }

    public static String convertUpperFirst(BigDecimal number) {
        BigDecimal bd = number.abs().setScale(2, 4);
        int dollars = (int)Math.floor((double)bd.intValue());
        StringBuilder inText = new StringBuilder(new NumberToText().convertA(dollars));
        int decimalIndex = number.toString().lastIndexOf(".");
        if (decimalIndex >= 0) {
            String nums = bd.toString();
            int cent = Integer.parseInt(nums.substring(nums.lastIndexOf(".") + 1));
            if (cent > 0) {
                inText.append(" and ").append(new NumberToText().convertA(cent));
            }
        }

        if (inText.length() == 0) {
            return "";
        } else {
            char[] stringArray = inText.toString().toLowerCase().toCharArray();
            stringArray[0] = Character.toUpperCase(stringArray[0]);
            String inword = new String(stringArray);
            return inword + " Only";
        }
    }

    public static String convertUpperFirst(Double number) {

        int dollars = (int)Math.floor(number.intValue());
        StringBuilder inText = new StringBuilder(new NumberToText().convertA(dollars));
        int decimalIndex = number.toString().lastIndexOf(".");
        if (decimalIndex >= 0) {
            String nums = number.toString();
            int cent = Integer.parseInt(nums.substring(nums.lastIndexOf(".") + 1));
            if (cent > 0) {
                inText.append(" and ").append(new NumberToText().convertA(cent));
            }
        }

        if (inText.length() == 0) {
            return "";
        } else {
            char[] stringArray = inText.toString().toLowerCase().toCharArray();
            stringArray[0] = Character.toUpperCase(stringArray[0]);
            return new String(stringArray);
        }
    }
    
    
    private static String currency(int dollars , String number) {

           StringBuilder inText = new StringBuilder(new NumberToText().convertA(dollars));
           
           if(inText.length() > 0) {
        	   
        	   inText.append(" Taka");
           }
           
           
           
           int decimalIndex = number.lastIndexOf(".");
           if (decimalIndex >= 0) {
               String nums = number.toString();
               int cent = Integer.parseInt(nums.substring(nums.lastIndexOf(".") + 1));
               
               if (cent > 0) {
            	   
            	   if(inText.length() > 0) {
                	   
            		   inText.append(" and ");
                   }
            	   
                   inText.append(new NumberToText().convertA(cent));
                   
                   inText.append(" Paisa");
               }
           }

           if (inText.length() == 0) {
               return "";
           } else {
             	inText.insert(inText.length(), " Only");
           	return new String(inText);
           }
    }
    
    
    public static String currencyText(BigDecimal number) {
    	
    	BigDecimal number1 = new BigDecimal(decimalFormat.format(number));
    	
    	int dollars = (int)Math.floor(number1.intValue());
    	 
    	return currency(dollars, number1.toString());
     	 
    }
    
    public static String currencyText(Double number) {
    	
    	BigDecimal number1 = new BigDecimal(decimalFormat.format(number));
    	
    	int dollars = (int)Math.floor(number1.intValue());
    	
    	return currency(dollars, number1.toString());
     
    }


    
    public static String currencyText(Float number) {
    	
    	BigDecimal number1 = new BigDecimal(decimalFormat.format(number));
    	
    	int dollars = (int)Math.floor(number1.intValue());
    	 
    	return currency(dollars, number1.toString());
     	 
    }
    
   public static String currencyText(Long number) {
    	
    	BigDecimal number1 = new BigDecimal(number);
    	
    	int dollars = (int)Math.floor(number1.intValue());
    	 
    	return currency(dollars, number1.toString());
     	 
    }
    
    public static String currencyText(String number) {
    
    	int dollars = (int)Math.floor(new BigDecimal(number).intValue());
    	 
    	return currency(dollars, number);
    	
    	 
    }

    public static void main(String[] args) {
    	
    	com.ibm.icu.text.DecimalFormat df1 = new com.ibm.icu.text.DecimalFormat("#####0.00");
    	Double totalAmout = 1234567891.20;
    	
    	System.out.println(currencyText(164975.00));
    	
    }

}
