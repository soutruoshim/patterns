public class BridgePatternDemo {

    interface IProgram {
        void teachIT();
        void teachVirtue();
    }

    static class BoardProgram implements IProgram {
        @Override
        public void teachIT() {
            System.out.println("Teaching IT using Board Program.");
        }

        @Override
        public void teachVirtue() {
            System.out.println("Teaching Virtue using Board Program.");
        }
    }

    static class MinistryProgram implements IProgram {
        @Override
        public void teachIT() {
            System.out.println("Teaching IT using Ministry Program.");
        }

        @Override
        public void teachVirtue() {
            System.out.println("Teaching Virtue using Ministry Program.");
        }
    }

    static abstract class Teacher {
        protected IProgram p;

        public void setProgram(IProgram p) {
            this.p = p;
        }

        public abstract void teach();
    }

    static class ITTeacher extends Teacher {
        @Override
        public void teach() {
            if (p != null) {
                p.teachIT();
            }
        }
    }

    static class VirtueTeacher extends Teacher {
        @Override
        public void teach() {
            if (p != null) {
                p.teachVirtue();
            }
        }
    }

    public static void main(String[] args) {
        IProgram board = new BoardProgram();
        IProgram ministry = new MinistryProgram();

        Teacher sok = new ITTeacher();
        sok.setProgram(board);
        sok.teach();

        sok.setProgram(ministry);
        sok.teach();

        Teacher dany = new VirtueTeacher();
        dany.setProgram(board);
        dany.teach();

        dany.setProgram(ministry);
        dany.teach();
    }
}
