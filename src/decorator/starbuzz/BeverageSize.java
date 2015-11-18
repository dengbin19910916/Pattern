package decorator.starbuzz;

/**
 * @author dengb
 */
public enum BeverageSize {
    /**
     * 小杯。
     */
    TALL {
        @Override
        public String toString() {
            return "Tall";
        }
    },
    /**
     * 中杯。
     */
    GRANDE {
        @Override
        public String toString() {
            return "Grande";
        }
    },
    /**
     * 大杯。
     */
    VENTI {
        @Override
        public String toString() {
            return "Venti";
        }
    }
}
