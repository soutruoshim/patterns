public class AdapterPatternDemo {

    interface ITranslator {
        void translate();
    }

    static class RussianTeacher {
        public void teachInRussian() {
            System.out.println("Teaching lesson in Russian language.");
        }
    }

    static class RussianTranslator implements ITranslator {
        private RussianTeacher teacher;

        public RussianTranslator() {
            this.teacher = new RussianTeacher();
        }

        @Override
        public void translate() {
            System.out.println("Adapter converts translate() to teachInRussian()");
            teacher.teachInRussian();
        }
    }

    static class Client {
        public void test() {
            ITranslator translator = new RussianTranslator();
            translator.translate();
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.test();
    }
}
