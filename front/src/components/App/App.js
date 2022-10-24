import './App.css';
import Header from './Header';
import Top from './Top';
import Main from './Main';

export default function App() {
  return (
    <div className="App">
      <Header />
      <Top />
      <Main />


      <footer className='footer-app'>
        <p>Todos os direitos reservados <b>LEVE</b> ©</p>
      </footer>

    </div>
  );
}