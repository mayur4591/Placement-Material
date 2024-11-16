#include <iostream>
#include <vector>
#include <string>
#include <iomanip>

using namespace std;

// Structure to represent an expense entry
struct Expense {
    string date;
    string category;
    double amount;
};

// Function to calculate total monthly expenses
double calculateMonthlyTotal(const vector<Expense>& expenses) {
    double total = 0;
    for (const Expense& expense : expenses) {
        total += expense.amount;
    }
    return total;
}

int main() {
    vector<Expense> expenses;
    char choice;

    do {
        cout << "Expense Tracker Menu:" << endl;
        cout << "1. Add an Expense" << endl;
        cout << "2. View Monthly Total" << endl;
        cout << "3. Exit" << endl;
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case '1':
                {
                    Expense expense;
                    cout << "Enter the date (e.g., DD-MM-YYYY): ";
                    cin >> expense.date;
                    cout << "Enter the category: ";
                    cin >> expense.category;
                    cout << "Enter the amount: ";
                    cin >> expense.amount;
                    expenses.push_back(expense);
                    cout << "Expense added successfully." << endl;
                    break;
                }
            case '2':
                {
                    if (expenses.empty()) {
                        cout << "No expenses entered yet." << endl;
                    } else {
                        double total = calculateMonthlyTotal(expenses);
                        cout << "Total Monthly Expenses: ₹" << fixed << setprecision(2) << total << endl;
                    }
                    break;
                }
            case '3':
                cout << "Exiting Expense Tracker. Have a great day!" << endl;
                break;
            default:
                cout << "Invalid choice. Please enter a valid option." << endl;
        }

    } while (choice != '3');

    return 0;
}