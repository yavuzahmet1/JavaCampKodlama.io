//import logo from './logo.svg';
import './App.css';
import Dashboard from './layouts/Dashboard'
import 'semantic-ui-css/semantic.min.css'
import { Container } from 'semantic-ui-react';
import Navi from './layouts/Navi';

function App() {
  return (
    <div className="App">
      <Navi />
      <Container className='main'>
        <Dashboard />
      </Container>
    </div>
  );
}

export default App;


/*     <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>*/