import react from 'react';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import './index.css';
import Navbar from './Components/Navbar';
import Header from './Components/Header';
import AddNews from './Components/Addnews';
import Updatenews from './Components/Updatenews';



function App() {
  return (
    <div >
    <BrowserRouter>
      <Navbar />
      <Routes>
        <Route path="/" element={<Header />} />
        <Route path="/addnews" element={<AddNews />} />
        <Route path="/updatenews/:news_id" element={<Updatenews />} />
      </Routes>
    </BrowserRouter>
    </div>
  );
}

export default App;
