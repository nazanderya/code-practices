import React from "react";
import ReactDOM from "react-dom";
import { Provider } from "react-redux";
import AppRouter from "./routers/AppRouter";
import configureStore from "./store/configureStore";
import { addExpense } from "./actions/expenses";
import getVisibleExpenses from "./selectors/expenses";
import FormValidationApp from "./components/FormValidationApp.jsx";
import App from "./playground/redux-thunk-test-youtube/App.jsx";
import Store from './playground/redux-thunk-test-youtube/store'

let storeInstance = Store()

const store = configureStore();

store.dispatch(addExpense({ description: "Water bill", amount: 4500 }));
store.dispatch(addExpense({ description: "Gas bill", createdAt: 1000 }));
store.dispatch(addExpense({ description: "Rent", amount: 1090000 }));
store.dispatch(addExpense({ description: "Accamodation", amount: 10900000 }));

const state = store.getState();
const visibleExpenses = getVisibleExpenses(state.expenses, state.filters);
console.log(visibleExpenses);

const jsx = (
  <Provider store={storeInstance}>
    <App />
  </Provider>
);

ReactDOM.render(jsx, document.getElementById("app"));
