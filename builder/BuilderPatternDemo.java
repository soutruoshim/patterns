public class BuilderPatternDemo {

    static class Exam {
        private String examType;
        private String qcmPart;
        private String matchingPart;
        private String questionPart;

        public void setExamType(String examType) {
            this.examType = examType;
        }

        public void setQcmPart(String qcmPart) {
            this.qcmPart = qcmPart;
        }

        public void setMatchingPart(String matchingPart) {
            this.matchingPart = matchingPart;
        }

        public void setQuestionPart(String questionPart) {
            this.questionPart = questionPart;
        }

        @Override
        public String toString() {
            return "Exam Type: " + examType + "\n"
                    + "QCM Part: " + qcmPart + "\n"
                    + "Matching Part: " + matchingPart + "\n"
                    + "Question Part: " + questionPart + "\n";
        }
    }

    interface IExamBuilder {
        void buildQCM();
        void buildMatching();
        void buildQuestion();
        Exam getResult();
    }

    static class QuizBuilder implements IExamBuilder {
        private Exam exam = new Exam();

        public QuizBuilder() {
            exam.setExamType("Quiz");
        }

        public void buildQCM() {
            exam.setQcmPart("10 multiple-choice questions");
        }

        public void buildMatching() {
            exam.setMatchingPart("5 matching questions");
        }

        public void buildQuestion() {
            exam.setQuestionPart("2 short-answer questions");
        }

        public Exam getResult() {
            return exam;
        }
    }

    static class MidtermBuilder implements IExamBuilder {
        private Exam exam = new Exam();

        public MidtermBuilder() {
            exam.setExamType("Midterm");
        }

        public void buildQCM() {
            exam.setQcmPart("20 multiple-choice questions");
        }

        public void buildMatching() {
            exam.setMatchingPart("10 matching questions");
        }

        public void buildQuestion() {
            exam.setQuestionPart("5 structured questions");
        }

        public Exam getResult() {
            return exam;
        }
    }

    static class FinalBuilder implements IExamBuilder {
        private Exam exam = new Exam();

        public FinalBuilder() {
            exam.setExamType("Final");
        }

        public void buildQCM() {
            exam.setQcmPart("40 multiple-choice questions");
        }

        public void buildMatching() {
            exam.setMatchingPart("15 matching questions");
        }

        public void buildQuestion() {
            exam.setQuestionPart("10 long-answer questions");
        }

        public Exam getResult() {
            return exam;
        }
    }

    static class ExamDirector {
        private IExamBuilder myBuilder;

        public ExamDirector(IExamBuilder myBuilder) {
            this.myBuilder = myBuilder;
        }

        public void construct() {
            myBuilder.buildQCM();
            myBuilder.buildMatching();
            myBuilder.buildQuestion();
        }
    }

    public static void main(String[] args) {
        IExamBuilder quizBuilder = new QuizBuilder();
        ExamDirector director1 = new ExamDirector(quizBuilder);
        director1.construct();
        Exam quiz = quizBuilder.getResult();

        IExamBuilder midtermBuilder = new MidtermBuilder();
        ExamDirector director2 = new ExamDirector(midtermBuilder);
        director2.construct();
        Exam midterm = midtermBuilder.getResult();

        IExamBuilder finalBuilder = new FinalBuilder();
        ExamDirector director3 = new ExamDirector(finalBuilder);
        director3.construct();
        Exam finalExam = finalBuilder.getResult();

        System.out.println("=== QUIZ EXAM ===");
        System.out.println(quiz);

        System.out.println("=== MIDTERM EXAM ===");
        System.out.println(midterm);

        System.out.println("=== FINAL EXAM ===");
        System.out.println(finalExam);
    }
}
