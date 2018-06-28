import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

class App extends Component {
  render() {

      // 'let' keyword allows the declared variable to mutate/change.
      let helloworld = 'First App, nothing interesting here.';
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h1 className="App-title">Hacker News: Powered by React</h1>
        </header>
        <p className="App-intro">
          To get started, edit <code>src/App.js</code> and save to reload.
        </p>
          <h2>{helloworld}</h2>
        <p className="App-footer">
          Copyright &copy; <br/> Erick Ogaro, 2018
        </p>
      </div>

    );
  }
}

export default App;
