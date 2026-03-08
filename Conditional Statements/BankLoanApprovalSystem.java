import java.util.Scanner;

public class BankLoanApprovalSystem {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int creditScore = obj.nextInt();
        double annualIncome = obj.nextDouble();
        double debtToIncomeRatio = obj.nextDouble();
        obj.nextLine();
        String loanType = obj.nextLine().trim();
        obj.close();

        System.out.println("Credit Score: " + creditScore);
        System.out.println("Annual Income: $" + annualIncome);
        System.out.println("Debt-to-Income Ratio: "+ debtToIncomeRatio + "%");
        System.out.println("Loan Type: "+ loanType);

        String decision = "Rejected";
        double loan = 0;

        if (creditScore >= 750) {
            if (debtToIncomeRatio <= 30) {
                if (loanType.equalsIgnoreCase("Home") || loanType.equalsIgnoreCase("Home loan")) {
                    decision = "Approved";
                    loan = 4*annualIncome;
                } else if (loanType.equalsIgnoreCase("Personal") || loanType.equalsIgnoreCase("Personal Loan")) {
                    decision = "Approved";
                    loan = annualIncome;
                } else if (loanType.equalsIgnoreCase("Business") || loanType.equalsIgnoreCase("Business Loan")) {
                    decision = "Approved";
                    loan = 3*annualIncome;
                }
            }
        }
        
        else if (creditScore >= 700) {
            if (debtToIncomeRatio > 30 && debtToIncomeRatio <= 40) {
                if (loanType.equalsIgnoreCase("Home") || loanType.equalsIgnoreCase("Home loan")) {
                    decision = "Needs review";
                    loan = 3*annualIncome;
                } else if (loanType.equalsIgnoreCase("Business") || loanType.equalsIgnoreCase("Business Loan")) {
                    decision = "Approved";
                    loan = 3*annualIncome;
                } else {
                    decision = "Approved";
                    loan = 3*annualIncome;
                }
            }
        }
        
        else if (creditScore >= 650) {
            if (debtToIncomeRatio > 30 && debtToIncomeRatio <= 40) {
                if (loanType.equalsIgnoreCase("Personal") || loanType.equalsIgnoreCase("Personal Loan")) {
                    decision = "Needs review";
                    loan = 0.5*annualIncome;
                } else if (loanType.equalsIgnoreCase("Home") || loanType.equalsIgnoreCase("Home loan")) {
                    decision = "Needs review";
                    loan = 3*annualIncome;
                } else if (loanType.equalsIgnoreCase("Business") || loanType.equalsIgnoreCase("Business Loan")) {
                    decision = "Approved";
                    loan = 3*annualIncome;
                }
            }
        }
        
        else if (creditScore < 650) {
            decision = "Rejected";
            loan = 0;
        }

       
        if (debtToIncomeRatio > 50) {
            decision = "Rejected";
            loan = 0;
        }

        System.out.println("Decision: " + decision);
        System.out.println("Maximum Loan Amount: $" + loan);
    }
}
