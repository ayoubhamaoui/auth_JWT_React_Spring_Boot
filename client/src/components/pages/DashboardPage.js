import React, { Component } from 'react';
import { MDBRow } from 'mdbreact';
import AdminCardSection1 from './sections/AdminCardSection1';
import AdminCardSection2 from './sections/AdminCardSection2';
import TableSection from './sections/TableSection';
import BreadcrumSection from './sections/BreadcrumSection';
import ChartSection1 from './sections/ChartSection1';
import ChartSection2 from './sections/ChartSection2';
import MapSection from './sections/MapSection';
import ModalSection from './sections/ModalSection';
import { Link, Redirect } from 'react-router-dom';

export default class DashboardPage extends Component {
  constructor(props){
    super(props)
    const token = localStorage.getItem("token")

    let loggedIn = true
    if(token == null){
      loggedIn = false
    }

    this.state = {
      loggedIn
    }
  }

  render(){
    if(this.state.loggedIn === false){
      return <Redirect to="/" />
    }

    return (
        <React.Fragment>
        <Link to="/logout">Logout</Link>
        <BreadcrumSection />
        <AdminCardSection1 />
        
        <MDBRow className="mb-4">
            <MapSection />
            <ModalSection />
        </MDBRow>
        <AdminCardSection2 />
      </React.Fragment>
    )
  }
  
}
