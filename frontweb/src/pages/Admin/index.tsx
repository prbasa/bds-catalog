import Navbar from './Navbar';
import User from './User';
import './styles.css';
import { BrowserRouter, Route, Routes } from 'react-router-dom';

const Admin = () => {
  return (
    <div className="admin-container">
      <Navbar />
      <div className="admin-content">
        
          <Routes>
            <Route path="/admin/users" element={<User />} />
          </Routes>
        
      </div>
    </div>
  );
};

export default Admin;
