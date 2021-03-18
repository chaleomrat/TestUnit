<?php
include "Calender.php";

use PHPUnit\Framework\TestCase;

class Test_calender extends TestCase
{
    private $calender;

    public function setUp(): void
    {
        $this->calender = new Calender();
    }
    public function testDate1()
    {
        $this->assertEquals('Wednesday',$this->calender->Showdate(02,03));
    }
    public function testDate2()
    {
        $this->assertEquals('Friday',$this->calender->Showdate(01,15));
    }
    public function testDate3()
    {
        $this->assertEquals('Tuesday',$this->calender->Showdate(04,20));
    }
}
