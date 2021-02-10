package JavaRush;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


// C:\Users\Home\Desktop\1.txt

public class CrUDTable2 {
    public static void main(String[] args) throws Exception {
//        args = new String[]{"-u", "1234585", "Blue Hat", "435.00", "21"};
        args = new String[]{"-d", "1234585"};

        // 2
        if (args.length == 0) {
            return;
        }

        HashMap<Integer, String> hashMap = new LinkedHashMap<>();
        String fileName;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            for (String s; (s = reader.readLine()) != null; ) {
                int id = Integer.parseInt(s.substring(0, 8).trim());
                hashMap.put(id, s);
            }
        }

        if (args[0].startsWith("-u")) {
            if (hashMap.containsKey(Integer.parseInt(args[1]))) {
                String product = String.format("%-8s%-30.30s%-8.8s%-4.4s", args[1], args[2], args[3], args[4]);
                hashMap.put(Integer.parseInt(args[1]), product);
            }

        } else if (args[0].startsWith("-d")) {
            hashMap.remove(Integer.parseInt(args[1]));
        }

        try (FileWriter fileWriter = new FileWriter(fileName)) {
            for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
                fileWriter.write(entry.getValue());
                fileWriter.write("\n");
            }
        }


//            // 1
//            int index = 0;
//            String fileName;
//
//
//            if (args.length == 0) {
//                return;
//            }
//
//            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//                fileName = reader.readLine();
//            }
//
//            List<String> stringList = new ArrayList<>();
//            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
//                for (String s; (s = reader.readLine()) != null; ) {
//                    stringList.add(s);
//                }
//            }
//
//            for (int i = 0; i < stringList.size(); i++) {
//                if (stringList.get(i).substring(0, 8).trim().equals(args[1])) {
//                    index = i;
//                }
//            }
//
//
//            if (args[0].startsWith("-u")) {
//                String product = String.format("%-8s%-30.30s%-8.8s%-4.4s", args[1], args[2], args[3], args[4]);
//                stringList.set(index, product);
//            } else if (args[0].startsWith("-d")) {
//                stringList.remove(index);
//            }
//
//
//            try (FileWriter fileWriter = new FileWriter(fileName)) {
//                for (String s : stringList) {
//                    fileWriter.write(s);
//                    fileWriter.write("\n");
//                }
//            }
    }

//    // 3
//    public static class Product {
//        int id;
//        String name;
//        String price;
//        String quantity;
//
//        public Product(int id, String name, String price, String quantity) {
//            this.id = id;
//            this.name = name;
//            this.price = price;
//            this.quantity = quantity;
//        }
//
//        @Override
//        public String toString() {
//            return String.format("%-8s%-30.30s%-8.8s%-4.4s", id, name, price, quantity);
//        }
//    }
//    public static void main(String[] args) throws Exception {
////        args = new String[]{"-u", "1234589", "Blue Hat", "435.00", "21"};
//        args = new String[]{"-d", "1234589"};
//
//        if (args.length == 0) {
//            return;
//        }
//
//        List<Product> productList = new ArrayList<>();
//        String fileName;
//
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            fileName = reader.readLine();
//        }
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
//            while (reader.ready()) {
//                Product product = getProduct(reader.readLine());
//                productList.add(product);
//            }
//        }
//
//        switch (args[0]) {
//            case "-u": {
//                int id = Integer.parseInt(args[1]);
//                String name = args[2], price = args[3], quantity = args[4];
//
//                Product productToUpdate = null;
//                for (Product product : productList) {
//                    if (product.id == id) {
//                        productToUpdate = product;
//                    }
//                }
//
//                if (productToUpdate != null) {
//                    productToUpdate.name = name;
//                    productToUpdate.price = price;
//                    productToUpdate.quantity = quantity;
//                }
//                break;
//            }
//            case "-d": {
//                int id = Integer.parseInt(args[1]);
//                Product productToDelete = null;
//                for (Product product : productList) {
//                    if (product.id == id) {
//                        productToDelete = product;
//                    }
//                }
//
//                if (productToDelete != null) {
//                    productList.remove(productToDelete);
//                }
//                break;
//            }
//        }
//
//
//        try (FileWriter fileWriter = new FileWriter(fileName)) {
//            for (Product product : productList) {
//                fileWriter.write(product.toString());
//                fileWriter.write("\n");
//            }
//        }
//    }
//
//    public static Product getProduct(String string) {
//        int countId = 8, countName = 38, countPrice = 46, countQuantity = 50;
//
//        String id = string.substring(0, countId).trim();
//        String name = string.substring(countId, countName).trim();
//        String price = string.substring(countName, countPrice).trim();
//        String quantity = string.substring(countPrice, countQuantity).trim();
//
//        return new Product(Integer.parseInt(id), name, price, quantity);
//    }
}

























