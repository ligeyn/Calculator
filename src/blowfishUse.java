public class blowfishUse {
        /**
         * Главный метод
         * @param arg
         */
        public static void main(String[] arg) {
            // Создаем ключ
            blowfish key = new blowfish("key)".getBytes());
            // Тестовое сообщение
            String message = "Testing";
            // Сообщение в форме массива байтов длиной, кратной 8-ми
            // и заполнением пробелами
            byte[] msg = key.padding(message.getBytes(), ' ');
            // Выводим оригинальное сообщение
            System.out.println("ORIGIN "+new String(msg));
            // Производим шифрование
            key.decipher(msg);
            // Выводим зашифрованное сообщение
            System.out.println("DECIPHER "+new String(msg));
            // Производим расшифрование
            key.encipher(msg);
            // Выводим расшифрованное сообщение
            System.out.println("ENCIPHER "+new String(msg));
        }
}
