import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Navbar from 'components/Navbar';
import Home from 'pages/Home';
import Admin from 'pages/Admin';
import Controle from 'pages/Controle';

const Rotas = () => (
  <BrowserRouter>
    <Navbar />
    <Routes>
      <Route path="/" element={<Home />} />
      <Route path="/controle" element={<Controle />} />
      <Route path="/admin" element={<Admin />} />
    </Routes>
    
  </BrowserRouter>
);

export default Rotas;
