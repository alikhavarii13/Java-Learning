public class AnswerException extends Exception{

    AnswerException(String message){
        super(message);
    }

    public static void checkAnswer(int correctAnswer, int userAnswer) throws AnswerException {
        if (correctAnswer != userAnswer) {
            throw new AnswerException("wrong");
        }
}}
