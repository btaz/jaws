'use strict';

import React, {useState, useEffect} from 'react';
import ReactDOM from 'react-dom';
import axios from "axios";

import './App.scss';

function App() {
  const [message, setMessage] = useState('jaws');

  useEffect(() => {
    async function fetchData() {
      const result = await axios.get('http://localhost:12345/api/echo?word=jaws');
      // console.log("Data: " + JSON.stringify(result.data));
      setMessage(result.data);
    }
    fetchData();
  }, []);

  return (
      <div className="app">
          Hello: {message}
      </div>
  )
}

ReactDOM.render(
    <App/>, document.getElementById('react')
);

