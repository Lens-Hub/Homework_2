package org.example;


    class SymbolReplacer implements ReplaceA, ReplaceB {
        @Override

        public void replaceSymbolA(String input) {
            String result = input.replace('a', 'z');
            System.out.println("Replace A with Z: " + result);
        }

        @Override
        public void replaceSymbolB(String input) {
            String result = input.replace('b', 'w');
            System.out.println("Replace B with W: " + result);
        }

}
