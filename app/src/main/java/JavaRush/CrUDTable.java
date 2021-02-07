package JavaRush;

// C:\Users\Home\Desktop\1.txt

import android.icu.text.PluralRules;

import androidx.annotation.NonNull;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CrUDTable {
    public static void main(String[] args) throws Exception {
        args = new String[]{"-c", "Green Hat", "135.00", "219098766"};

        if (args.length == 0) {
            return;
        }

        List<Product> productList = new ArrayList<>();
        String fileName;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.ready()) {
                Product product = getProduct(reader.readLine());
                productList.add(product);
            }
        }

        switch (args[0]) {
            case "-c":
                String name = args[1], price = args[2], quantity = args[3];
                int id = 0;

                for (Product product : productList) {
                    if (product.id > id) {
                        id = product.id;
                    }
                }

                Product product = new Product(++id, name, price, quantity);
                productList.add(product);

                try (FileWriter fileWriter = new FileWriter(fileName, true)) {
                    fileWriter.write(product.toString());
                }
                break;
        }
    }

    public static Product getProduct(String string) {
        int countId = 8, countName = 38, countPrice = 46, countQuantity = 50;

        String id = string.substring(0, countId).trim();
        String name = string.substring(countId, countName).trim();
        String price = string.substring(countName, countPrice).trim();
        String quantity = string.substring(countPrice, countQuantity).trim();

        return new Product(Integer.parseInt(id), name, price, quantity);
    }

    // 3
    public static class Product {
        int id;
        String name;
        String price;
        String quantity;

        public Product(int id, String name, String price, String quantity) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        @NonNull
        @Override
        public String toString() {
            return String.format(System.lineSeparator() + "%-8d%-30.30s%-8.8s%-4.4s", id, name, price, quantity);
        }
    }

//    // 1 and 2
//    public static void main(String[] args) throws Exception {
//        args = new String[]{"-c", "Black Hat", "35.00", "21"};
//        String fileName;
//
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            fileName = reader.readLine();
//        }
//
//        if (args.length == 0) {
//            return;
//        }
//
//        // 2
//        int id, newId = 0;
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
//            while (reader.ready()) {
//                id = Integer.parseInt(reader.readLine().substring(0, 8).trim());
//
//                if (id > newId) {
//                    newId = id;
//                }
//            }
//        }
//
//        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
//            fileWriter.write(String.format(System.lineSeparator() + "%-8d%-30.30s%-8.8s%-4.4s", ++newId, args[1], args[2], args[3]));
//        }

//        // 1
//        int newId, countId = 8, countName = 30, countPrice = 8, countQuantity = 4;
//        List<Integer> integerList = new ArrayList<>();
//
//
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
//            for (String s; (s = reader.readLine()) != null; ) {
//                int index = s.indexOf(' ');
//
//                if (index > 0 && index < countId) {
//                    integerList.add(Integer.parseInt(s.substring(0, index)));
//                } else {
//                    integerList.add(Integer.parseInt(stringToCharArray(countId, s).toString()));
//                }
//            }
//        }
//
//        newId = Collections.max(integerList) + 1;
//
//        StringBuilder stringNewId = paddingSpaces(countId, String.valueOf(newId));
//        StringBuilder stringNewName = paddingSpaces(countName, args[1]);
//        StringBuilder stringNewPrice = paddingSpaces(countPrice, args[2]);
//        StringBuilder stringNewQuantity = paddingSpaces(countQuantity, args[3]);
//
//        String stringNewProduct = "\n" + stringNewId + stringNewName + stringNewPrice + stringNewQuantity;
//
//        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
//            fileWriter.write(stringNewProduct);
//        }
//    }
//
//    public static StringBuilder paddingSpaces(int count, String original) {
//        StringBuilder stringBuilder = new StringBuilder(original);
//
//        if (stringBuilder.length() <= count) {
//            for (int i = stringBuilder.length(); i < count; i++) {
//                stringBuilder.append(" ");
//            }
//        } else {
//            stringBuilder = stringToCharArray(count, original);
//        }
//        return stringBuilder;
//    }
//
//    public static StringBuilder stringToCharArray(int count, String original) {
//        StringBuilder stringBuilder = new StringBuilder();
//
//        char[] chars = original.toCharArray();
//
//        for (int i = 0; i < count; i++) {
//            stringBuilder.append(chars[i]);
//        }
//        return stringBuilder;
//    }

//    }
}






























