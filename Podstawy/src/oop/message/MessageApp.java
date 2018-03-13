package oop.message;

public class MessageApp {
    public static void main(String[] args) {
        DictionaryMessage dictionaryMessage = new DictionaryMessage();
        DictionaryMessage dictionaryMessage1 = new DictionaryMessage(new String[]{"Ala", "ma","kota"});
        RandomMessage smallRandomMessage = new RandomMessage(10,100);
        RandomMessage bigRandomMessage = new RandomMessage(1000, 100);
        Message [] messages = {dictionaryMessage, dictionaryMessage1, smallRandomMessage, bigRandomMessage};
        printMessages(messages);


    }

    public static void printMessages (Message[] messages){
        for (int i = 0; i < messages.length; i++) {
            System.out.println("Message [" + i + "] = " + messages[i].getMessage());
        }
    }
}
